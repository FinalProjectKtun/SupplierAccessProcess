package com.cagri.supplieraccesproccess.repository;

import com.cagri.supplieraccesproccess.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
