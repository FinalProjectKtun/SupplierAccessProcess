package com.cagri.supplieraccesproccess.services.conrete;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessDataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.SuccessResult;
import com.cagri.supplieraccesproccess.entities.Person;
import com.cagri.supplieraccesproccess.repository.PersonRepository;
import com.cagri.supplieraccesproccess.services.abstracts.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public DataResult<List<Person>> getListPerson() {
        return new SuccessDataResult<List<Person>>(this.personRepository.findAll(),"all list person");
    }

    @Override
    public Result addPerson(Person person) {
        this.personRepository.save(person);
        return new SuccessResult("person added");
    }
}
