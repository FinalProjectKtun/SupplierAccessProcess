package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "supplier")
public class Supplier{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String supplierName;
    private String supplierConnectSystemName;
    private String personResponsibleForTheRequest;
    private String phoneNumOfThePerResForTheReq;
    private String supplierDate;
    private String supplierConnectStarted;
    private String supplierConnectEnd;
    private String description;
    private String reasonForRejection;
    private String status;

}
