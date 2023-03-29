package com.cagri.supplieraccesproccess.services.conrete;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessDataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessResult;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.repository.SupplierRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public static Supplier mapToSupplier(SupplierRequest request) {
        Supplier supplier = new Supplier();
        supplier.setSupplierName(request.getSupplierName());
        supplier.setSupplierDate(request.getSupplierDate());
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
}
