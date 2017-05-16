package cz.mufi.bpm.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Our product.
 * @author zdenek
 *
 */
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Column(nullable = false)
	private String name;
	
	@Column
	private int price;
	
	public long getId() { return id;}
	public void setId(long id) { this.id = id;}

	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	public int getPrice() { return price;}
	public void setPrice(int price) { this.price = price;}

}
