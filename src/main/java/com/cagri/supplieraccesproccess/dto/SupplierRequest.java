package com.cagri.supplieraccesproccess.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierRequest {

    private Long id;
    private String supplierName;
    private String supplierConnectSystemName;

    private String personResponsibleForTheRequest;
    private String phoneNumOfThePerResForTheReq;
    private String reasonForRejection;

    private String supplierDate;
    private String supplierConnectStarted;

    private String reasonForRejection;

    private String supplierConnectEnd;
    private String description;
    private String status;

}
