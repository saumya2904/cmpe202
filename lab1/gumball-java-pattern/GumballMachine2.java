
public class GumballMachine2 extends GumballMachine{
	public GumballMachine2(int numberGumballs)
	{
		super(numberGumballs);
	}
	public void insertQuarters(int a, int b) {
		if ((a+b)==50)
	state=hasQuarterState;
	else 
		state= noQuarterState;
	}

}
