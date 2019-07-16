package numbers;

import java.util.Scanner;

public class sumOfNumbers {
	     static int SumOfEvenNumbers(int Start,int last)
	     {
	    	 int index,sum = 0;
	    	 for(index=Start;index<=last;index++)
	    	 {
	    		 if(index%2==0)
	    		 {
	    			 sum = sum+index;
	    		 }
	    	 }
	    	 return sum;
	     }
static int SumOfoddNumbers(int Start,int last)
{
	int index,sum=0;
	for(index=Start;index<=last;index++)
	{
		if(index%2!=0)
		{
			sum=sum+index;
			
		}
	}
	return sum;
}
 public static void main(String[] args)
 {
	 Scanner sc= new Scanner(System.in);
	 int Start,last;
	 System.out.println("Start=");
	 Start=sc.nextInt();
     System.out.println("last=");
      last = sc.nextInt();
     System.out.println("Sumofeven="+SumOfEvenNumbers(Start,last));
     System.out.println("Sumofodd="+SumOfoddNumbers(Start,last));
     sc.close();
	 
 }
}
