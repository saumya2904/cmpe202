
public class CreditCardNumDecorator implements IDecorator {

	@Override
	public String display(String num) {
		// TODO Auto-generated method stub
		if (num.length() >= 5 && num.length() <= 8)
		{   
			System.out.println("inside");
			System.out.println(num.length());
			String num1 = num.substring(0, 4);
			num1 += " ";
			String num2 = num.substring(4, (num.length()));
			System.out.println(num2);
			return num1+num2;
		}
		else if (num.length() >= 9 && num.length() <= 12)
		{
			String num1 = num.substring(0, 4);
			num1 += " ";
			String num2 = num.substring(4, 8);
			num2 += " ";
			String num3 = num.substring(8, (num.length()));
			return num1+num2+num3;
		}
		else if (num.length() >= 13 && num.length() <= 16)
		{
			String num1 = num.substring(0, 4);
			num1 += " ";
			String num2 = num.substring(4, 8);
			num2 += " ";
			String num3 = num.substring(8, 12);
			num3 += " ";
			String num4 = num.substring(12);
			return num1+num2+num3+num4;
		} 
		else
            return num;
	}
	}
