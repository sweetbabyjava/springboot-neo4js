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

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Neo4jsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ContactsTest {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    LocationRepository locationRepository;


    @Test
    void getContacts(){

        Person person = personRepository.findByName("Trankalis");
        Contacts contact = new Contacts(person, new Date(), 120);
        Person other = personRepository.findByName("Doe");
        other.addContact(contact);
        personRepository.save(other);

    }

}
