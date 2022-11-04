package basicprogram;

public class FirstAndLastDigitOfNumber {
public static void main(String []args)
{
	int num=3456;
	int firstDigit=0;
	int lastDigit=0;
	
	lastDigit = num%10;
	System.out.println("Last digit number:" +lastDigit);
	
	while(num!=0)
	{
		firstDigit = num%10;
		num /=10;
	}
	System.out.println("First digit number:" +firstDigit);
	
}
}
