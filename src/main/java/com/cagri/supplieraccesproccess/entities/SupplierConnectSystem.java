package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "supplierConnectSystem")
@Data
@Entity
public class SupplierConnectSystem extends BaseEntity{

    private String supplierConnectSystemName;

}
