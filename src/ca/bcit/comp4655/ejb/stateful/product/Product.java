package ca.bcit.comp4655.ejb.stateful.product;

import java.io.Serializable;

public class Product implements Serializable
{
	private static final long serialVersionUID = -8246816061192176182L;
	private String id;
	private String description;
	private double price;
	
	public Product(){}
	
	public Product(String id, String description, double price) 
	{
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "Product ID: " + id + "\tProduct Name:" + description + "\tProduct Price:$" + price;
	}
}
