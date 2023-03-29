package com.cagri.supplieraccesproccess.repository;

import com.cagri.supplieraccesproccess.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
