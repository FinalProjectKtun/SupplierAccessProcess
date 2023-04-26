package com.cagri.supplieraccesproccess.services.abstracts;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SupplierConnectSystemRequest;
import com.cagri.supplieraccesproccess.dto.SupplierScsRequestDto;
import com.cagri.supplieraccesproccess.entities.SupplierConnectSystem;
import com.cagri.supplieraccesproccess.entities.SupplierScsRequestEntity;

import java.util.List;

public interface SupplierScsRequestService {
    DataResult<List<SupplierScsRequestEntity>> getListSScS();
    Result addSscsR(List<SupplierScsRequestDto> supplierScsRequestDtos);

}
