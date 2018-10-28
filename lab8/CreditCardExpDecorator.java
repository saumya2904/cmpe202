
public class CreditCardExpDecorator implements IDecorator {

	@Override
	public String display(String num) {
		if (num.length()>=3)
		{
			String num1 = num.substring(0, 2);
			num1 = num1 + "/";
			String num2 = num.substring(2);
			return num1+num2;
		}
		else 
			return num;
	}

}
