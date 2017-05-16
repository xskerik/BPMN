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

import cz.mufi.bpm.model.domain.Invoice;
import cz.mufi.bpm.rest.repository.InvoiceRepository;
import cz.mufi.bpm.rest.repository.ProductRepository;


@RestController
@RequestMapping("/invoices")
public class InvoiceResource {
	
	private static final String defaultValue = "--";

	@Autowired
	private InvoiceRepository invoiceRepository;
	
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
}
