package ca.bcit.comp4655.ejb.stateful.shoppingcart;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import ca.bcit.comp4655.ejb.stateful.product.Product;

@Stateful( mappedName="ShoppingCart" )
@Remote( ShoppingCart.class )
public class ShoppingCartBean implements ShoppingCart 
{
	private Map<Product, Integer> cart = new HashMap<Product, Integer>();
	
	@Override
	public void purchase( Product product, int quantity ) 
	{
		if ( cart.containsKey(product) )
		{
			int currentQuantity = cart.get( product );
			currentQuantity += quantity;
			cart.put(product, currentQuantity);
		}
		else
		{
			cart.put(product, quantity );
		}
	}

	@Override
	public Map<Product, Integer> getCartContents() 
	{
		return cart;
	}

	@Override
	@Remove
	public void checkout() 
	{
		cart.clear();
	}
}
