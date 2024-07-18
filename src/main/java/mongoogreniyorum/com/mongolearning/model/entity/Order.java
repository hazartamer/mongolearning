package mongoogreniyorum.com.mongolearning.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "orders")
public class Order {
    private String id;
    private double totalPrice;
    private List<OrderItem> orderItems;
    private User user;
}
