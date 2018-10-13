import java.util.ArrayList;

public class Burger implements IAddCustOrder {

	
	private String type;
	private int quantity;
	private String meat;
	private double price;
	public ArrayList<String> toppings = new ArrayList<>();
	public ArrayList<String> topbuntoppings = new ArrayList<>();
	public ArrayList<String> onmeattoppings = new ArrayList<>();
	public ArrayList<String> bottombuntoppings = new ArrayList<>();
	int count = 1;
	
	public Burger(String type, int quantity) {
		this.quantity = quantity;
		this.type = type;
		this.setType(type);
	}
	
	public void setType(String type)
	{
	  switch(type)
	  {
	  case ("HB"):
	  {
		  this.meat = "Ham";
	      this.price = 6.39;
	  }
	  case ("BB"):
	  {
		  this.meat = "Bacon";
	      this.price = 7.19;
	  }
	  case ("BCB"):
	  {
		  this.meat = "Bacon";
	      this.price = 7.79;
	  }
	  case ("LHB"):
	  {
		  this.meat = "Ham";
	      this.price = 4.59;
	  }
	  case ("LBB"):
	  {
		  this.meat = "Bacon";
	      this.price = 5.29;
	  }
	  case ("LBCB"):
	  {
		  this.meat = "Bacon";
	      this.price = 6.19;
	  }		  
	  }
	}
	  public String print1()
	  {
		  StringBuilder burgerdesc = new StringBuilder();
		
		  burgerdesc.append(quantity);
		  burgerdesc.append("   ");
		  burgerdesc.append(type);
		  burgerdesc.append("\t\t");
		  burgerdesc.append(price);
		  burgerdesc.append("\n");
		  burgerdesc.append("{{{{ "+meat+" }}}}");
		  burgerdesc.append("\n");
		  for (int i =0; i<toppings.size();i++) {
			  burgerdesc.append(toppings.get(i));
			  burgerdesc.append("\n");
		  }
		  return burgerdesc.toString();
		
	  }
	  
    public void addTopping(String place, String type1) {
			if(place == "ONMEAT")
			{
			toppings.add("->" +type1);
			onmeattoppings.add("->" +type1);
			}
			else 
			{   
				if(place == "TOPBUN")
				{
					topbuntoppings.add(type1);
				}
				else if (place == "BOTTOMBUN")
				{
					bottombuntoppings.add(type1);
				}
				toppings.add(type1);
			}
		}
			

	@Override
	public double getPrice() {
		return quantity*price;
	}

	@Override
	public String print2() {
		  StringBuilder burgerdesc = new StringBuilder();
		  burgerdesc.append("SANDWICH #" +count);
		  burgerdesc.append("\n");
		  burgerdesc.append(quantity);
		  burgerdesc.append("   ");
		  burgerdesc.append(type);
		  burgerdesc.append("\t\t");
		  burgerdesc.append("\n");
		  for (int i =0; i<topbuntoppings.size();i++) {
			  burgerdesc.append(topbuntoppings.get(i));
			  burgerdesc.append("\n");
		  }
		  for (int i =0; i<onmeattoppings.size();i++) {
			  burgerdesc.append(onmeattoppings.get(i));
			  burgerdesc.append("\n");
		  }
		  for (int i =0; i<bottombuntoppings.size();i++) {
			  burgerdesc.append(bottombuntoppings.get(i));
			  burgerdesc.append("\n");
		  }
		  burgerdesc.append("{{{{ "+meat+" }}}}");
		  return burgerdesc.toString();
	}
	
	
	  }

