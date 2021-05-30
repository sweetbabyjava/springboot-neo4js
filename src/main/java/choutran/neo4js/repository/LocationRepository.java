package choutran.neo4js.repository;

import choutran.neo4js.model.Location;
import choutran.neo4js.model.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface LocationRepository extends Neo4jRepository<Location, Long> {
    Location findByDiscription(@Param("name") String name);
}
