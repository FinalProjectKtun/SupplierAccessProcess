package com.cagri.supplieraccesproccess.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierRequest {

    private Long id;
    private String supplierName;
    private String personResponsibleForTheRequest;

    private String phoneNumOfThePerResForTheReq;
    private Date supplierDate;

    private Date supplierConnectStarted;

    private Date supplierConnectEnd;
    private String description;

}
