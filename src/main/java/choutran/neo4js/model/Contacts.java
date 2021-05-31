package choutran.neo4js.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@RelationshipProperties

public class Contacts {
    @Id
    @GeneratedValue
    private Long id;

    private final Date date;
    private final int duration;

    @TargetNode
    private Person person;

    public Contacts(Person person, Date date, int duration) {
        this.person = person;
        this.date = date;
        this.duration = duration;
    }
}
