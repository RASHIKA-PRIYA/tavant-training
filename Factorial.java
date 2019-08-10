package factorial;
import java.util.Scanner;

public class Factorial {
	public static class Factorialproblem {

		static int CalculateFactorial(int a)
	{
		int index,temp = 1;
		for(index=1;index<=a;index++)
		{
			temp=temp*index;
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter the No : ");
		
		number =scanner. nextInt();
		System.out.println("Factorial ="+CalculateFactorial(number) );
		scanner.close();
		
		}
	}

	
	}


