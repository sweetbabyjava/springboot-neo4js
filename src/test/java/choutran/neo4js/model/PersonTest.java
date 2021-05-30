package choutran.neo4js.model;

import choutran.neo4js.Neo4jsApplication;
import choutran.neo4js.repository.LocationRepository;
import choutran.neo4js.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Neo4jsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class PersonTest {

    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    void setup() {
        personRepository.deleteAll();
        Perso
        List<Person> persons = new ArrayList<>();
        persons.add(new Person());
        persons.get(0);
        for (String s: persons){
            Location location = new Location();
            location.setDiscription(s);
            locationRepository.save(location);
        }
    }
    @Test
    void getName() {
    }

    @Test
    void getFirstname() {
    }
}
