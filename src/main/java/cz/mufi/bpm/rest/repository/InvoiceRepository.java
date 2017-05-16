package cz.mufi.bpm.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cz.mufi.bpm.model.domain.Invoice;

@RepositoryRestResource
public interface InvoiceRepository extends CrudRepository<Invoice, Long>  {

}
