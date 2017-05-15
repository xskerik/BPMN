package cz.mufi.bpm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.mufi.bpm.model.domain.Product;
import cz.mufi.bpm.model.form.bestsolution.CustomerInputData;
import cz.mufi.bpm.model.form.bestsolution.Result;
import cz.mufi.bpm.rest.repository.ProductRepository;

@Service
public class BestSolutionService {
	
	@Autowired
	private ProductRepository productRepository;

	public Result searchBestProducts(CustomerInputData customerInputData) {
		
		List<Product> all = (List<Product>) productRepository.findAll();
		
		// apply some shitty algoritmus or meybe random
		
		return new cz.mufi.bpm.model.form.bestsolution.Result(all);
	}
}
