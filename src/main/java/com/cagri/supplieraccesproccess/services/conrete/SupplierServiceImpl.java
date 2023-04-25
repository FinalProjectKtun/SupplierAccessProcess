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
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        supplier.setDescription(request.getDescription());
        return supplier;
    }


    @Override
    public DataResult<List<Supplier>> getListSupplier() {
        return new SuccessDataResult<List<Supplier>>(supplierRepository.findAll(),"listed all supplier");
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
    public Result updateSupplier(SuplierStatusUpdateRequestDto requestDto, Long supplierId) {
        Optional<Supplier> supplierDb=this.supplierRepository.findById(supplierId);
        Supplier supplier = supplierDb.get();
        if (supplierDb.isPresent()) {
            supplier.setStatus(requestDto.getStatus());
            this.supplierRepository.save(supplier);
        }
        return new SuccessResult("güncellendi "+ supplierId) ;
    }


}
