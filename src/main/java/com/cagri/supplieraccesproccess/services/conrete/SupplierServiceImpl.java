package com.cagri.supplieraccesproccess.services.conrete;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessDataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessResult;
import com.cagri.supplieraccesproccess.dto.SuplierStatusUpdateRequestDto;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.repository.SupplierRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.data.domain.Sort;
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public static Supplier mapToSupplier(SupplierRequest request) {
        Supplier supplier = new Supplier();
        supplier.setId(request.getId());
        supplier.setSupplierName(request.getSupplierName());
        supplier.setSupplierDate(request.getSupplierDate());
        supplier.setPersonResponsibleForTheRequest(request.getPersonResponsibleForTheRequest());
        supplier.setPhoneNumOfThePerResForTheReq(request.getPhoneNumOfThePerResForTheReq());
        supplier.setSupplierConnectStarted(request.getSupplierConnectStarted());
        supplier.setSupplierConnectEnd(request.getSupplierConnectEnd());
        supplier.setReasonForRejection(request.getReasonForRejection());
<<<<<<< Updated upstream
        supplier.setSupplierConnectSystemName(request.getSupplierConnectSystemName());
=======
>>>>>>> Stashed changes
        supplier.setStatus("Onaylanmadı");
        supplier.setDescription(request.getDescription());
        return supplier;
    }


    @Override
    public DataResult<List<Supplier>> getListSupplier() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        return new SuccessDataResult<List<Supplier>>(supplierRepository.findAll(sort), "listed all suppliers sorted by id");
    }

    @Override
    public Result addSupplier(List<SupplierRequest> supplierRequest) {
        List<Supplier> suppliers= supplierRequest.stream()
                .map(SupplierServiceImpl :: mapToSupplier)
                .collect(Collectors.toList());
        this.supplierRepository.saveAll(suppliers);
        return new SuccessResult("added Supplier");
    }

    @Override
    public Result updateSupplier(SuplierStatusUpdateRequestDto requestDto) {
        Optional<Supplier> supplierDb=this.supplierRepository.findById(requestDto.getId());
        Supplier supplier = supplierDb.get();
        if (supplierDb.isPresent())     {
            supplier.setId(requestDto.getId());
            supplier.setReasonForRejection(requestDto.getReasonForRejection());
            supplier.setStatus(requestDto.getStatus());
            supplier.setReasonForRejection(requestDto.getReasonForRejection());
            this.supplierRepository.save(supplier);
            System.out.println("status => "+requestDto.getStatus().toString());
            System.out.println("ReasonForRejection => "+requestDto.getReasonForRejection().toString());

        }
        return new SuccessResult("güncellendi") ;
    }

}
