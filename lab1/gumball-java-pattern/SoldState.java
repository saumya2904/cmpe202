package cmpe202.cmpe202_2;

public class SoldState implements State {
	 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
	 if(gumballMachine.getCount()>0)
		{
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}

	@Override
	public void insertCoins(int[] coins) {
		System.out.println("Please wait, we're already giving you a gumball");
		
	}
	
	public void insertQuarters(int a, int b) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
}