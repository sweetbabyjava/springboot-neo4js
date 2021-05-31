package choutran.neo4js.controller;

import choutran.neo4js.model.Person;
import choutran.neo4js.repository.LocationRepository;
import choutran.neo4js.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ContactController {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/person/{name}")
    public Person getAllContactsFromPerson(@PathVariable String name){
       return personRepository.findByName(name) ;
    }

}
