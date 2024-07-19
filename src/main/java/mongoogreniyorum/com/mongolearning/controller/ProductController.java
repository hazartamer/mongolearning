package mongoogreniyorum.com.mongolearning.controller;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.ListProductResponse;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.ProductAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Product;
import mongoogreniyorum.com.mongolearning.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductAddResponse save(@RequestBody ProductAddRequest request){
       return productService.save(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ListProductResponse> getAll(){
       return productService.getAll();
    }
}
