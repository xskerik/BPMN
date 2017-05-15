package cz.mufi.bpm.rest.resource;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cz.mufi.bpm.model.test.Greeting;
import cz.mufi.bpm.service.TestService;

@RestController
public class TestResource {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private TestService testService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/square")
    @ResponseBody
    public Map<Long, Long> greeting(@RequestParam(value="num", defaultValue="0") int num) {
    	
    	return Collections.singletonMap(counter.incrementAndGet(), testService.square(num));
    }
    
    @RequestMapping("/exception")
    public ResponseEntity<String> exception() {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);            
    }
}
