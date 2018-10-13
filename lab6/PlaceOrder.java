
import java.util.ArrayList;
import java.util.Date;

public class PlaceOrder
{
   private int orderNum;
   private ArrayList<IAddCustOrder> items = new ArrayList<IAddCustOrder>();
   private double totalprice;
   private String date;
   
    public PlaceOrder(int orderNo)
    {
       
        totalprice = 0;
        date = (new Date()).toString();
        orderNum = orderNo;
    }
    
    public int getOrderNumber(){
        return this.orderNum;
    }
    
 
    public String getDate(){
        return this.date;
    }

    public void addItem(IAddCustOrder item){
        this.items.add(item);
    }
    

    public double getOrderTotal(){
        for(IAddCustOrder item: items){
            this.totalprice += item.getPrice();
        }
        return this.totalprice;
    }
    
 
    public String print(){
    	StringBuilder orderdesc = new StringBuilder();
    	orderdesc.append("Order Number: ");
    	orderdesc.append(orderNum);
    	orderdesc.append("\n");
        for(IAddCustOrder item: items){
        	orderdesc.append(item.print1());
        	orderdesc.append("\n");
        }
        return orderdesc.toString();
    }

	public Object print2() {
    	StringBuilder orderdesc = new StringBuilder();
    	orderdesc.append("Order Number: ");
    	orderdesc.append(orderNum);
    	orderdesc.append("\n");
        for(IAddCustOrder item: items){
        	orderdesc.append(item.print2());
        	orderdesc.append("\n");
        }
        return orderdesc.toString();
	}
    
}
