package grademarkswitchcase;

import java.util.Scanner;

public class Gradeverification {
	 public static String markGrade(int number)
	 {
		 for(int index=1;index<=4;index++)
		 {
			 switch(index)
			 {
			 case 1:
				 if(number>=90)
					 return "Grade A";
				 break;
			 case 2:
				 if(number>=75&&a<90)
					 return "Grade B";
			     break;
			 case 3:
				 if(number>=60&&a<75)
					 return "Grade C";
				 break;
			 case 4:
				 if(number<60)
					 return "Grade D";
				
			 }
		 }
		 return null;
		 
	 }
	 public static void main(String[] args)
	 {
		 Scanner scanner = new Scanner(System.in);
		 int number;
		 System.out.println("Grade = ");
		 number = scanner.nextInt();
		 System.out.print(markGrade(number));
		 scanner.close();
	 }

}
