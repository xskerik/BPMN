package cz.mufi.bpm.rest.resource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cz.mufi.bpm.model.domain.Customer;
import cz.mufi.bpm.model.domain.FlatInvoice;
import cz.mufi.bpm.model.domain.Invoice;
import cz.mufi.bpm.model.domain.Product;
import cz.mufi.bpm.rest.repository.CustomerRepository;
import cz.mufi.bpm.rest.repository.InvoiceRepository;
import cz.mufi.bpm.rest.repository.ProductRepository;


@RestController
@RequestMapping("/invoices")
public class InvoiceResource {
	
	private static final String defaultValue = "--";

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
    @RequestMapping("/isInReclamationTime")
    public boolean isInReclamationTime(@RequestParam(value="idInvoice", defaultValue=defaultValue) long id) {
    	
    	Invoice invoice = invoiceRepository.findOne(id);
    	
    	Date twoYearsAgo = Date.from(LocalDateTime.now().plusYears(-2).atZone(ZoneId.systemDefault()).toInstant());
    	
    	return !invoice.getDate().before(twoYearsAgo);
    }
    
    @RequestMapping("{idInvoice}/isInReclamationTime")
    public boolean isInReclamationTime2(@PathVariable("idInvoice") long id) {
    	
    	Invoice invoice = invoiceRepository.findOne(id);
    	
    	Date twoYearsAgo = Date.from(LocalDateTime.now().plusYears(-2).atZone(ZoneId.systemDefault()).toInstant());
    	
    	return !invoice.getDate().before(twoYearsAgo);
    }
    
    @RequestMapping("/get")
    public FlatInvoice getInvoice(@RequestParam(value="idInvoice", defaultValue=defaultValue) long id) {  	
    	
    	Invoice invoice = invoiceRepository.findOne(id);
    	
    	FlatInvoice flatInvoice = new FlatInvoice();
    	
    	flatInvoice.setCustomerName(invoice.getCustomer().getFirstName() +" "+ invoice.getCustomer().getLastName());
    	flatInvoice.setCustomerEmail(invoice.getCustomer().getEmail());
    	flatInvoice.setProductId(invoice.getProduct().getId());
    	flatInvoice.setProductName(invoice.getProduct().getName());
    	
    	return flatInvoice;
    }
}
