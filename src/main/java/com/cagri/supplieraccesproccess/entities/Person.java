package com.cagri.supplieraccesproccess.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "person")
@Data
@Entity
public class Person extends BaseEntity{
    private String personName;
    private String personPhone;


}
