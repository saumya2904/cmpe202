public class Main {

	public static void main(String[] args) {
		GumballMachine1 gumballMachine = new GumballMachine1(3);
		System.out.println("------------GumballMachine1-----------------");

		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		

		System.out.println(gumballMachine);
		System.out.println("------------GumballMachine2-----------------");
	    GumballMachine2 gumballMachine2 = new GumballMachine2(2);

		System.out.println(gumballMachine2);
        
		gumballMachine2.insertQuarters(25,25);
		gumballMachine2.ejectQuarter();
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarters(25, 0);
		gumballMachine2.insertQuarters(25,25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarters(25, 0);
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarters(25, 25);
		gumballMachine2.ejectQuarter();
		gumballMachine2.turnCrank();
		gumballMachine2.ejectQuarter();

		System.out.println(gumballMachine2);
		System.out.println("------------GumballMachine3----------------");
		GumballMachine3 gumballMachine3 = new GumballMachine3(2);
		System.out.println(gumballMachine3);
        int[] m = {25,25,25};
		gumballMachine3.insertCoins(m);
		gumballMachine3.ejectCoins();
		gumballMachine3.turnCrank();
		
		 int[] m1 = {25,25,5,10,10};
		gumballMachine3.insertCoins(m1);
		 int[] m3 = {5};
		gumballMachine3.insertCoins(m3);
		gumballMachine3.turnCrank();
		gumballMachine3.ejectCoins();
		gumballMachine3.turnCrank();
		gumballMachine3.ejectCoins();

		System.out.println(gumballMachine3);
	}
}
