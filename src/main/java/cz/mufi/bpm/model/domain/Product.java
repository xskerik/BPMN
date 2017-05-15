package cz.mufi.bpm.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private String name;
	private ProductType productType;
	private int price;
	
	
	public long getId() { return id;}
	public void setId(long id) { this.id = id;}

	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	public ProductType getProductType() { return productType;}
	public void setProductType(ProductType productType) { this.productType = productType;}

	public int getPrice() { return price;}
	public void setPrice(int price) { this.price = price;}

	public enum ProductType {
		SW,
		HW;
	}
}
