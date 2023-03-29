package com.cagri.supplieraccesproccess.services.abstracts;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SupplierConnectSystemRequest;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.entities.SupplierConnectSystem;

import java.util.List;

public interface SupplierConnectSystemService {
    DataResult<List<SupplierConnectSystem>> getListScS();
    Result addScS(List<SupplierConnectSystemRequest> supplierConnectSystemRequests);
}
