package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "supplier")
public class Supplier extends BaseEntity{

    private String supplierName;
    private Date supplierDate;

    private Date supplierConnectStarted;

    private Date supplierConnectEnd;
    private String description;




}
