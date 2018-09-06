public class Main {

	public static void main(String[] args) {
		GumballMachine1 obj1 = new GumballMachine1(5);

		System.out.println("--------------Gumball Machine 1 -------------");

		obj1.insertMoney( 25 );
		obj1.turnCrank();
		obj1.insertMoney(0);
		obj1.turnCrank();


		System.out.println("--------------Gumball Machine 2 -------------");
		GumballMachine2 obj2 = new GumballMachine2(5);
		obj2.insertMoney( 25,25 );
		obj2.turnCrank();
		obj2.insertMoney(25, 0);
		obj2.turnCrank();
		obj2.insertMoney(0, 0);
		obj2.turnCrank();
		
		System.out.println("--------------Gumball Machine 3 -------------");
		GumballMachine3 obj3 = new GumballMachine3(5);
		int[] coins3= {10,10,5,5,10,10};
		obj3.insertMoney(coins3);
		obj3.turnCrank();
		int[] coins4= {0,0};
		obj3.insertMoney(coins4);
		obj3.turnCrank();
		int[] coins5= {25,25,10};
		obj3.insertMoney(coins5);
		obj3.turnCrank();

	}
}
