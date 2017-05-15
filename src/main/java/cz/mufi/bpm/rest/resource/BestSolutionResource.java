package cz.mufi.bpm.rest.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cz.mufi.bpm.model.form.bestsolution.CustomerInputData;
import cz.mufi.bpm.service.BestSolutionService;

@RestController
public class BestSolutionResource {
	
    @Autowired
    private BestSolutionService bestSolutionService;
    
    @RequestMapping(value = "/bestSolution", method = RequestMethod.POST)
    public cz.mufi.bpm.model.form.bestsolution.Result searchBestProducts(@RequestBody CustomerInputData customerInputData) {
    	
    	return bestSolutionService.searchBestProducts(customerInputData);
    }

}
