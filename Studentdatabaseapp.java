package javasummerproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studentdatabaseapp {
	//get index
		public static int getindex(int n) {
		    n=n%10;
			return n;
		}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		 List<Student> studentList = new ArrayList<>();
		//insert,delete pay tution, show balance
		 int i=0;
		 while(i!=4) {
		System.out.println("Enter the Operation you need to perform:\n ");
		System.out.println(" 1.Enroll Students\n 2.Remove Students\n 3.Pay for tution \n 4.Show details \n 5.Exit \n");
	    int choice= in.nextInt();
	    System.out.println("\n \n=======================================================================");
		    switch(choice){
		    case 1:
			{
	  
				//ask in which year they need to be enrolled
				System.out.print("Enter the year in which the students are \n 1.1st year \n 2.2nd year \n 3.3rd year\n 4.4th year\n  : ");
				int year=in.nextInt();
		  
			        Student stud =new Student();
			       	stud.enroll(year);
		            stud.setgradeYear(year); 
		            System.out.println("\n \n=======================================================================");
		            System.out.println(stud.showInfo());
		            System.out.println("\n \n=======================================================================");
		            studentList.add(stud); 
			} 
			break;
		    case 2:{
				    	System.out.println("Enter the roll no of the student to be removed :");
				    	int n= in.nextInt();
			            n=getindex(n);
				    	studentList.remove(n-1);
				    	System.out.println("\n \n=======================================================================");
				    	
		            }
		    break;
		    case 3:
		    	System.out.println("Enter the roll no of the student :");
		    	int n= in.nextInt();
	            n=getindex(n);
	            studentList.get(n-1).payTution();
	            System.out.println("\n \n=======================================================================");
	            break;
		 
		    case 4:
		    	{
		    	System.out.println("Enter the roll no of the student :");
		    	int n1= in.nextInt();
	            n1=getindex(n1);
		    	System.out.println(studentList.get(n1-1).showInfo());
		    	System.out.println("\n \n=======================================================================");
		    	}
		    	break;
		    case 5:
		    	i=4;
		    break;
		    }
		}
	}

}
