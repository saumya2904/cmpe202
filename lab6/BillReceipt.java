
public class BillReceipt implements IReceiptStrategy {



	@Override
	public String print(PlaceOrder order)	 {
		
		StringBuilder receiptbill = new StringBuilder();
		receiptbill.append("\n----------------------------------------\n");
		receiptbill.append(order.getDate());
		receiptbill.append("\n");
		receiptbill.append(order.print());
		receiptbill.append("Sub. Total:");
		receiptbill.append("\t\t$");
       // DecimalFormat fmt = new DecimalFormat("0.00");
        receiptbill.append(order.getOrderTotal());
        receiptbill.append("\n----------------------------------------\n");
        return receiptbill.toString();
		// TODO Auto-generated method stub
		
	}

}
