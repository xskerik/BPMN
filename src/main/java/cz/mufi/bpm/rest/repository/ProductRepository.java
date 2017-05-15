package cz.mufi.bpm.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cz.mufi.bpm.model.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long>  {

}
