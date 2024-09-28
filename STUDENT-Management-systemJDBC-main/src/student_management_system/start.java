package student_management_system;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.student;
import com.studentdao.studentdao;
public class start {

	public static void main(String[] args) throws IOException{
		System.out.println("welcome to jntua student management system");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		
		while(true)
		{
			System.out.println("press 1 to add new student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to update student");
			System.out.println("press 5 to exit the application");
		    	
			int c= Integer.parseInt(br.readLine());
			
			
			switch (c)
			{
			case 1://adding the student
				System.out.println("enter studnet id: ");
				int id = Integer.parseInt(br.readLine());
				
				
				System.out.println("enter user name: ");
				String name = br.readLine();
				
				
				System.out.println("enter student phone no:");
				String phoneno = br.readLine();
				
				System.out.println("enter student city");
				String city = br.readLine();
				
//	to store this date we need to create an object for it..
//				create the student object to store the data
//				we stored the student data in the studnet object we need to store this data in an database
				
				student st = new student(id,name,phoneno,city);
//			here when we put ctrl+1 -> then it is going to insert the value	
				boolean ans = studentdao.insertStudent(st);
				
				if(ans)
				{
					System.out.println("student added successfully");
				}
				else
				{
					System.out.println("something went wromg");
				}
				System.out.println("enter student phone no");
				String phone  = br.readLine();
				
				
				break;
				
			case 2://delete the student
				System.out.println("enter the student id which you want to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f = studentdao.deletestudent(userId);
				if(f)
				{
					System.out.println("data is deleted successfully");
				}
				else
				{
					System.out.println("something went wrong");
				}
				
				break;
			case 3://display the studnet
				System.out.println("displaying the student data");
				studentdao.showallstudent();
				
				break;
			case 4:
				System.out.println("enter the student data whose data you can update");
				int userId2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter student id");
				int Id2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter student name");
				String name2 = br.readLine();
				
				System.out.println("enter student phone no");
				String phone2 = br.readLine();
				
				System.out.println("enter student city");
				String city2 = br.readLine();
				
				student st2 = new student(Id2,name2,phone2,city2);
				
				
				boolean ans2 = studentdao.updateStudent(st2, userId2);
				if(ans2)
				{
					System.out.println("student is updated successfully");
				}
				else
				{
					System.out.println("something went wromg");
				}
				System.out.println(st2);
				
				
				
				break;

				
			case 5://exit
				go = false;
				break;
				
			default:
				System.out.println("wrong choice try again");
				
				
			
			}
			System.out.println("thankyou for my application!!!");
		}

	}

}
