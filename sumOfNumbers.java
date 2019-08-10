package numbers;

import java.util.Scanner;

public class sumOfNumbers {
	     static int SumOfEvenNumbers(int firstnumber,int lastnumber)
	     {
	    	 int index,sum = 0;
	    	 for(index=firstnumber;index<=lastnumber;index++)
	    	 {
	    		 if(index%2==0)
	    		 {
	    			 sum = sum+index;
	    		 }
	    	 }
	    	 return sum;
	     }
static int SumOfoddNumbers(int firstnumber,int lastnumber)
{
	int index,sum=0;
	for(index=firstnumber;index<=lastnumber;index++)
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
	 firstnumber=sc.nextInt();
     System.out.println("last=");
      lastnumber = sc.nextInt();
     System.out.println("Sumofeven="+SumOfEvenNumbers(firstnumber,lastnumber));
     System.out.println("Sumofodd="+SumOfoddNumbers(firstnumber,lastnumber));
     sc.close();
	 
 }
}
