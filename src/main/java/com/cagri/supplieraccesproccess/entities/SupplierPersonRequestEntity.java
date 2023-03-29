package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "supplierPersonRequestEntity")
@Data
@Entity
public class SupplierPersonRequestEntity extends BaseEntity{

    private Long id;

    private Long personId;
    private Long supplierId;
}
