package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "supplierScsRequestEntity")
@Data
@Entity
public class SupplierScsRequestEntity extends BaseEntity{
    private Long id;
    private Long supplierId;
    private Long scsId;
}
