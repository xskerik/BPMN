package cz.mufi.bpm.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cz.mufi.bpm.model.domain.Product;
import cz.mufi.bpm.model.test.Greeting;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long>  {

}
