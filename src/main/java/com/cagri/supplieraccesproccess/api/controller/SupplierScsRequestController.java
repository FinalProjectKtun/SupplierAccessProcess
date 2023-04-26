package com.cagri.supplieraccesproccess.api.controller;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SupplierConnectSystemRequest;
import com.cagri.supplieraccesproccess.dto.SupplierScsRequestDto;
import com.cagri.supplieraccesproccess.entities.SupplierConnectSystem;
import com.cagri.supplieraccesproccess.entities.SupplierScsRequestEntity;
import com.cagri.supplieraccesproccess.repository.SupplierScsRequestEntityRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierScsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/SupplierScsRequest")
@RestController
@CrossOrigin("*")
public class SupplierScsRequestController {

    @Autowired
    private SupplierScsRequestService supplierScsRequestService;

    @GetMapping("/getSupplierScsRequest")
    public DataResult<List<SupplierScsRequestEntity>> getListSsr() {
        return this.supplierScsRequestService.getListSScS();
    }
    @PostMapping("/addSupplierScsRequest")
    public Result addScs (@RequestBody List<SupplierScsRequestDto> supplierScsRequestDtos) {
        System.out.println(supplierScsRequestService.toString());
        return this.supplierScsRequestService.addSscsR(supplierScsRequestDtos);
    }
}
