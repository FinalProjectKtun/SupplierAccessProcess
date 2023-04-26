package com.cagri.supplieraccesproccess.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierRequest {

    private Long id;
    private String supplierName;
    private String personResponsibleForTheRequest;
    private String phoneNumOfThePerResForTheReq;
    private String supplierDate;
    private String supplierConnectStarted;
    private String supplierConnectEnd;
    private String description;
    private String status;

}
