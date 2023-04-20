package com.cagri.supplieraccesproccess.api.controller;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SupplierConnectSystemRequest;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.entities.SupplierConnectSystem;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierConnectSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/scs")
@RestController
@CrossOrigin("*")
public class SupplierConnectSystemController {

    @Autowired
    private SupplierConnectSystemService supplierConnectSystemService;

    @GetMapping("/getSupplierConnectSystem")
    public DataResult<List<SupplierConnectSystem>> getListScs() {
        return this.supplierConnectSystemService.getListScS();
    }
    @PostMapping("/addSupplierConnectSystem")
    public Result addScs (@RequestBody List<SupplierConnectSystemRequest> supplierConnectSystemRequests) {
        System.out.println(supplierConnectSystemService.toString());
        return this.supplierConnectSystemService.addScS(supplierConnectSystemRequests);
    }
}
