
public class Fries implements IAddCustOrder{	
	private int quantity;
	private double price;
	private String size;
	

	
	public Fries(String size2, int quantity2) {
		this.quantity = quantity2;
		this.size = size2;
		this.setPrice(size);
	}

	public void setPrice(String size)
	{
	  switch(size)
	  {
	  case ("Little"):
	  {
	      this.price = 2.79;
	  }
	  case ("Regular"):
	  {
	      this.price = 3.39;
	  }
	  case ("Large"):
	  {
	      this.price = 5.59;
	  }		  
	}
	}
	
	  public String print1()
	  {
		  StringBuilder friesdesc = new StringBuilder();
		  friesdesc.append(quantity);
		  friesdesc.append("  ");
		  friesdesc.append(size+" Fries");
		  friesdesc.append("\t\t");
		  friesdesc.append(this.price);
		  return friesdesc.toString();
		
	  }

	@Override
	public double getPrice() {
		return quantity*price;
	}

	@Override
	public String print2() {
		  StringBuilder friesdesc = new StringBuilder();
		  friesdesc.append(quantity);
		  friesdesc.append("  ");
		  friesdesc.append(size+" Fries");
		  friesdesc.append("\t\t");
		  return friesdesc.toString();
	}
	

}
