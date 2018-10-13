
public class PackingReceipt implements IReceiptStrategy {
	@Override
	public String print(PlaceOrder order)	 {
		
		StringBuilder packingreceipt = new StringBuilder();
		packingreceipt.append("\n----------------------------------------\n");
		packingreceipt.append(order.getDate());
		packingreceipt.append("\n");
		packingreceipt.append(order.print2());
		packingreceipt.append("\n----------------------------------------\n");
        return packingreceipt.toString();
		// TODO Auto-generated method stub
		
	}

}
