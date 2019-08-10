package grademark;

import java.util.Scanner;

public class Gradeverification {
	       
         public static String isPass(int number)
	       {
	    	 if(number>=40)
	    		 return "Pass";
	    	 else
	    		 return "Fail";
	       }
	       public static String markGrade(int number)
	       {
	    	   if(number>=90)
	    		   return "Grade A";
	    	   else if(number>=75&&number<90)
	    		   return "Grade B";
	    		   else if(number>=60&&number<75)
	    			   return "Grade C";
	    			   else
	    				   return "Grade D";
	       }
	       public static void main(String[] args) {
				
               Scanner scanner = new Scanner(System.in);
	    	   int number;
	    	   System.out.println("Grade=");
	    	   number = scanner.nextInt();
	    	   System.out.println(isPass(number));
	    	   System.out.println(markGrade(number));
	    	   scanner.close();
	       }
	       
	       }

	    	   
	       
	       

