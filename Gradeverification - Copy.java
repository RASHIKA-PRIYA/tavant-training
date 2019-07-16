package grademarkswitchcase;

import java.util.Scanner;

public class Gradeverification {
	 public static String markGrade(int a)
	 {
		 for(int index=1;index<=4;index++)
		 {
			 switch(index)
			 {
			 case 1:
				 if(a>=90)
					 return "Grade A";
				 break;
			 case 2:
				 if(a>=75&&a<90)
					 return "Grade B";
			     break;
			 case 3:
				 if(a>=60&&a<75)
					 return "Grade C";
				 break;
			 case 4:
				 if(a<60)
					 return "Grade D";
				
			 }
		 }
		 return null;
		 
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 int a;
		 System.out.println("Grade = ");
		 a = sc.nextInt();
		 System.out.print(markGrade(a));
		 sc.close();
	 }

}
