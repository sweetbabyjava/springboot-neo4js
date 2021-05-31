package choutran.neo4js.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.Date;

@Data
@AllArgsConstructor
@RelationshipProperties

public class Visits {

    @Id
    @GeneratedValue
    private Long id;

    private final Date date;
    private final int duration;

    @TargetNode
    private final Person person;
}
