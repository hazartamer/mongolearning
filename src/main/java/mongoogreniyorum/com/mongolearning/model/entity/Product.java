package mongoogreniyorum.com.mongolearning.model.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "products")
public class Product {
    private String id;
    private String name;
    private double price;

}
