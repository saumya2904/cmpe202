
public class Main {
	
	static int orderno;
	
	public static void main(String args[]) {
		IReceiptStrategy bill = new BillReceipt();
		IReceiptStrategy bill1 = new PackingReceipt();
		PlaceOrder order = new PlaceOrder(++orderno);
		Fries fries = new Fries("Regular", 1);
		Burger burger = new Burger("LBB",1);
		burger.addTopping("TOPBUN", "LETTUCE");
		burger.addTopping("TOPBUN", "TOMATO");
		burger.addTopping("ONMEAT", "G ONION");
		burger.addTopping("ONMEAT", "JALA GRILLED" );
		order.addItem(burger);
		order.addItem(fries);
		System.out.println(bill.print(order));
		System.out.println(bill1.print(order));
	}

}
