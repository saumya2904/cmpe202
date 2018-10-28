/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private String date1 = "" ;
    private IDecorator cced;
	public CreditCardExp(){
		cced = new CreditCardExpDecorator(); 
	}
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			date1 = cced.display(date);
			return "[" + date1 + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
		{
			if ("x".equals(ch)) {
				if (date.length()>1) {
				date = date.substring(0,(date.length()-1));}
				else
					date = "";
			}
			else
			date += ch ;}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}
