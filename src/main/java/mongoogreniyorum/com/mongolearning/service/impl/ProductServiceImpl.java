package mongoogreniyorum.com.mongolearning.service.impl;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Product;
import mongoogreniyorum.com.mongolearning.repository.ProductRepository;
import mongoogreniyorum.com.mongolearning.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product findById(String id) {
       return productRepository.findById(id).orElseThrow(() -> new RuntimeException("yoksa yok"));
    }

    @Override
    public ProductAddResponse save(ProductAddRequest request){
        Product product = Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .build();
        productRepository.save(product);
        ProductAddResponse productAddResponse = ProductAddResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
        return productAddResponse;
    }
}
