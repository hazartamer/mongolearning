package mongoogreniyorum.com.mongolearning.service;

import mongoogreniyorum.com.mongolearning.model.dto.ListProductResponse;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Product;

import java.util.List;

public interface ProductService {
    Product findById(String id);
    ProductAddResponse save(ProductAddRequest request);

    List<ListProductResponse> getAll();
}
