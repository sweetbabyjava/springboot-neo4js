package choutran.neo4js.model;

import choutran.neo4js.Neo4jsApplication;
import choutran.neo4js.repository.LocationRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Neo4jsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class LocationTest {

    @Autowired
    LocationRepository locationRepository;

    @BeforeEach
    void setup() {
        locationRepository.deleteAll();
    }

    @Test
    void getDiscription() {

        List<String> locations = Arrays.asList("Sternschanze", "BT5", "REWE");
        for (String s: locations){
            Location location = new Location();
            location.setDiscription(s);
            locationRepository.save(location);
        }

        assertNotNull(locationRepository.findByDiscription("Sternschanze"));
        assertNotNull(locationRepository.findByDiscription("BT5"));
        assertNotNull(locationRepository.findByDiscription("REWE"));
    }

    @Test
    void getVisitors() {
    }
}
