package mongoogreniyorum.com.mongolearning.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private Product product;
    private int quantity;
}
