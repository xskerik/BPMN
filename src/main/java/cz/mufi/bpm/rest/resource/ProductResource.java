package cz.mufi.bpm.rest.resource;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cz.mufi.bpm.model.domain.Invoice;
import cz.mufi.bpm.model.domain.Product;
import cz.mufi.bpm.rest.repository.InvoiceRepository;
import cz.mufi.bpm.rest.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	private static final String defaultValue = "--";
	
	@Autowired
	private ProductRepository productRepository;
	
    @RequestMapping("/isProductOnStock")
    public boolean isProductOnStock(@RequestParam(value="idProduct", defaultValue=defaultValue) long id) {
    	
    	Product product = productRepository.findOne(id);
    	
    	return product == null ? false : true;
    }
    
    @RequestMapping("/get")
    public Product getProduct(@RequestParam(value="idProduct", defaultValue=defaultValue) long id) {
    	
    	Product product = productRepository.findOne(id);
    	
    	return product;
    }

}
