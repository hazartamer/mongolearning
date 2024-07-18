package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class ProductAddRequest {
    private String name;
    private double price;
}
