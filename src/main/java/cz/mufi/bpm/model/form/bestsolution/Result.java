package cz.mufi.bpm.model.form.bestsolution;

import java.util.List;

import cz.mufi.bpm.model.domain.Product;

/**
 * The result of best {@link Product}s for particular {@link Customer} based on his input form passed as {@link CustomerInputData}.
 * @author zdenek
 *
 */
public class Result {

	private final List<Product> bestProducts;
	
	public Result (List<Product> bestProducts) {
		this.bestProducts = bestProducts;
	}

	public List<Product> getBestProducts() {
		return bestProducts;
	}
}
