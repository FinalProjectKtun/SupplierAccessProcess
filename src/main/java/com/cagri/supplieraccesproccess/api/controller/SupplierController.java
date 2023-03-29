package com.cagri.supplieraccesproccess.api.controller;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.dto.SupplierRequest;
import com.cagri.supplieraccesproccess.entities.Person;
import com.cagri.supplieraccesproccess.entities.Supplier;
import com.cagri.supplieraccesproccess.repository.SupplierRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/getSupplier")
    public DataResult<List<Supplier>> getListPerson() {
        return this.supplierService.getListSupplier();
    }
    @PostMapping("/addSupplier")
    public Result addPerson (@RequestBody List<SupplierRequest> supplierRequest) {
        System.out.println(supplierRequest.toString());
        return this.supplierService.addSupplier(supplierRequest);
    }
}
