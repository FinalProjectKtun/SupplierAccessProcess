package com.cagri.supplieraccesproccess.services.abstracts;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SuplierStatusUpdateRequestDto;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.entities.Supplier;

import java.util.List;

public interface SupplierService {
    DataResult<List<Supplier>> getListSupplier();
    Result addSupplier(List<SupplierRequest> supplierRequest);

     Result updateSupplier(SuplierStatusUpdateRequestDto requestDto);
}
