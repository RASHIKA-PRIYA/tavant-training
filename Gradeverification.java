package grademark;

import java.util.Scanner;

public class Gradeverification {
	       
         public static String isPass(int a)
	       {
	    	 if(a>=40)
	    		 return "Pass";
	    	 else
	    		 return "Fail";
	       }
	       public static String markGrade(int a)
	       {
	    	   if(a>=90)
	    		   return "Grade A";
	    	   else if(a>=75&&a<90)
	    		   return "Grade B";
	    		   else if(a>=60&&a<75)
	    			   return "Grade C";
	    			   else
	    				   return "Grade D";
	       }
	       public static void main(String[] args) {
				
               Scanner sc = new Scanner(System.in);
	    	   int a;
	    	   System.out.println("Grade=");
	    	   a = sc.nextInt();
	    	   System.out.println(isPass(a));
	    	   System.out.println(markGrade(a));
	    	   sc.close();
	       }
	       
	       }

	    	   
	       
	       

