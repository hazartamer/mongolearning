package mongoogreniyorum.com.mongolearning.model.entity;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "invoices")
public class Invoice {
    @Id
    private String id;

    private User user;

    private Order order;
}
