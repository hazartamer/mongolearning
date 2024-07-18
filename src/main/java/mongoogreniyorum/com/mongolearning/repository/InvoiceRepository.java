package mongoogreniyorum.com.mongolearning.repository;

import mongoogreniyorum.com.mongolearning.model.entity.Invoice;
import mongoogreniyorum.com.mongolearning.service.InvoiceService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
}
