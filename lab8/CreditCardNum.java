/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private String number1 = "" ;
    private IDecorator ccnd;
	public CreditCardNum(){
		ccnd = new CreditCardNumDecorator(); 
	}
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			number1 = ccnd.display(number);
			return "[" + number1 + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			if ("x".equals(ch)) {
				if (number.length()>1) {
				number = number.substring(0,(number.length()-1));}
				else
					number = "";
			}
			else
			number += ch ;}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}
