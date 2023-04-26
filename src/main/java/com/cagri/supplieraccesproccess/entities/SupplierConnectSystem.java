package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "supplierConnectSystem")
@Data
@Entity
public class SupplierConnectSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String supplierConnectSystemName;
}
