package cmpe202.cmpe202_2;

import java.util.Random;

@SuppressWarnings("unused")
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	int total=0;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}

	public void insertCoins(int[] coins) {
		for (int i =0; i<coins.length;i++) {
			this.total=this.total+coins[i];
		}
		if (this.total >= 50)
		{
			gumballMachine.setState(gumballMachine.getHasQuarterState());}
		else 
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		
	}
	public void insertQuarters(int a, int b) {
		if ((a+b)==50)
			gumballMachine.setState(gumballMachine.getHasQuarterState());
	else 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
}
