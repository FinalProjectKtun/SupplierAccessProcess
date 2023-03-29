package com.cagri.supplieraccesproccess.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierRequest {
    private String supplierName;
    private Date supplierDate;

    private Date supplierConnectStarted;

    private Date supplierConnectEnd;
    private String description;
}
