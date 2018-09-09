package cmpe202.cmpe202_2;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    int total = 0;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no coins");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin/coins";
	}

	@Override
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
