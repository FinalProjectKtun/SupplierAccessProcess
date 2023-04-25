package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "supplier")
public class Supplier{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String supplierName;

    private String personResponsibleForTheRequest;

    private String phoneNumOfThePerResForTheReq;
    private Date supplierDate;
    private Date supplierConnectStarted;
    private Date supplierConnectEnd;
    private String description;
    private String status;

}
