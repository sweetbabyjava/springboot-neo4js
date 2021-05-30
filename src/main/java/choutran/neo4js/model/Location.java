package choutran.neo4js.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@Data
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @Relationship(type="visited", direction = Relationship.Direction.INCOMING)
    List<Person> visitors;
}
