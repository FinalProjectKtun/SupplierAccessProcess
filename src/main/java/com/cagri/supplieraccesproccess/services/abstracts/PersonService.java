package com.cagri.supplieraccesproccess.services.abstracts;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.entities.Person;

import java.util.List;

public interface PersonService {
    DataResult<List<Person>> getListPerson();
    Result addPerson(Person person);
}
