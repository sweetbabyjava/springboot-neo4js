package choutran.neo4js.model;

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
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstname;

    @Relationship(type="contact_with", direction = Relationship.Direction.INCOMING)
    List<Contacts> contacts;

}
