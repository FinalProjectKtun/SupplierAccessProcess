package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "supplierScsRequestEntity")
@Data
@Entity
public class SupplierScsRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long supplierId;
    private Long scsId;
}
