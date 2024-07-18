package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class ProductAddResponse {
    private String name;
    private double price;
}
