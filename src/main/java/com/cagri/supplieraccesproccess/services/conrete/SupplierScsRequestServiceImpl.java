package com.cagri.supplieraccesproccess.services.conrete;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessDataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessResult;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.dto.SupplierScsRequestDto;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.entities.SupplierScsRequestEntity;
import com.cagri.supplieraccesproccess.repository.SupplierScsRequestEntityRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierScsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierScsRequestServiceImpl implements SupplierScsRequestService {


    @Autowired
    private SupplierScsRequestEntityRepository supplierScsRequestEntityRepository;

    public static SupplierScsRequestEntity  scsRequest(SupplierScsRequestDto requestDto) {
        SupplierScsRequestEntity  requestEntity = new SupplierScsRequestEntity();
        requestEntity.setSupplierId(requestDto.getSupplierId());
        requestEntity.setScsId(requestDto.getScsId());
        return requestEntity;
    }

    @Override
    public DataResult<List<SupplierScsRequestEntity>> getListSScS() {
        return new SuccessDataResult<List<SupplierScsRequestEntity>>(this.supplierScsRequestEntityRepository.findAll(),"Listed");
    }

    @Override
    public Result addSscsR(List<SupplierScsRequestDto> supplierScsRequestDtos) {
        List<SupplierScsRequestEntity> suppliers= supplierScsRequestDtos.stream()
                .map(SupplierScsRequestServiceImpl :: scsRequest)
                .collect(Collectors.toList());
        this.supplierScsRequestEntityRepository.saveAll(suppliers);
        return new SuccessResult("added SupplierScsRequest");
    }
}
