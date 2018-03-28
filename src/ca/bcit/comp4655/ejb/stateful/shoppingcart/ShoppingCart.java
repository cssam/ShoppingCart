package ca.bcit.comp4655.ejb.stateful.shoppingcart;

import java.util.Map;

import javax.ejb.Remove;

import ca.bcit.comp4655.ejb.stateful.product.Product;

public interface ShoppingCart 
{
	void purchase( Product product, int quantity );
	Map<Product, Integer>getCartContents();
	@Remove void checkout();
}
