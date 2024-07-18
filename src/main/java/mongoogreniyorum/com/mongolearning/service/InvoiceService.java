package mongoogreniyorum.com.mongolearning.service;

import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddResponse;

public interface InvoiceService {

    InvoiceAddResponse save(InvoiceAddRequest request);
}
