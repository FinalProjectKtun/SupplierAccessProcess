package com.cagri.supplieraccesproccess.services.conrete;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessDataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessResult;
import com.cagri.supplieraccesproccess.dto.SupplierConnectSystemRequest;
import com.cagri.supplieraccesproccess.entities.SupplierConnectSystem;
import com.cagri.supplieraccesproccess.repository.SupplierConnectSystemRepository;
import com.cagri.supplieraccesproccess.services.abstracts.SupplierConnectSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierConnectSystemServiceImpl implements SupplierConnectSystemService {

    @Autowired
    private SupplierConnectSystemRepository supplierConnectSystemRepository;
    public  static SupplierConnectSystem mapToScs(SupplierConnectSystemRequest request){
        SupplierConnectSystem system = new SupplierConnectSystem();
        system.setSupplierConnectSystemName(request.getSupplierConnectSystemName());
        return system;

    }
    @Override
    public DataResult<List<SupplierConnectSystem>> getListScS() {
        return new SuccessDataResult<List<SupplierConnectSystem>>(supplierConnectSystemRepository.findAll(),"listed all scs ");
    }

//    @Override
//    public Result addScS(List<SupplierConnectSystemRequest> supplierConnectSystemRequests) {
//        List<SupplierConnectSystem> supplierConnectSystems = supplierConnectSystemRequests.stream()
//                .map(SupplierConnectSystemServiceImpl::mapToScs)
//                .collect(Collectors.toList());
//        this.supplierConnectSystemRepository.save();
//        return  new SuccessResult("added");
//    }

    public DataResult<List<SupplierConnectSystem>> addScS(List<SupplierConnectSystemRequest> supplierConnectSystemRequests) {
        List<SupplierConnectSystem> supplierConnectSystems = supplierConnectSystemRequests.stream()
                .map(SupplierConnectSystemServiceImpl::mapToScs)
                .collect(Collectors.toList());

        List<SupplierConnectSystem> savedSystems = supplierConnectSystemRepository.saveAll(supplierConnectSystems);


        return new SuccessDataResult<List<SupplierConnectSystem>>(savedSystems,"SupplierConnectSystem objects added successfully");
    }
}
