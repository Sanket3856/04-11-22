package basicprogram;
import java.util.Scanner;

public class SumOfAllEvenNo {
	public static void main(String []args)
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("\n The Sum of Even number" +n+ "is:"+sum);
	}

}
