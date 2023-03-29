package com.cagri.supplieraccesproccess.api.controller;

import com.cagri.supplieraccesproccess.core.utilities.results.DataResult;
import com.cagri.supplieraccesproccess.core.utilities.results.Result;
import com.cagri.supplieraccesproccess.entities.Person;
import com.cagri.supplieraccesproccess.repository.PersonRepository;
import com.cagri.supplieraccesproccess.services.abstracts.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getPerson")
    public DataResult<List<Person>> getListPerson() {
        return this.personService.getListPerson();
    }
    @PostMapping("/addPerson")
    public Result addPerson (@RequestBody Person person) {
        System.out.println(person.toString());
        return this.personService.addPerson(person);
    }


}
