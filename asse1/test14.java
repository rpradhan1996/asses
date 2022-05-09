package asse1;
import java.util.ArrayList;
import java.util.Iterator;
interface Assessment
{
	void centPercenter();
	
}

class Grade implements Assessment,Runnable
{
	@Override
	public void centPercenter() {
		// TODO Auto-generated method stub
		
		int studentcount = 0;

		Thread t = new Thread();
		ArrayList <Student> al = new ArrayList<>();
		
		al.add(new Student(1121,"Ritam","Medinipur",new StudentMarks(87,98)));
		al.add(new Student(1122,"Meghna","Medinipur",new StudentMarks(98,100)));
		al.add(new Student(1123,"Prasun","Belda",new StudentMarks(98,97)));
		al.add(new Student(1124,"Suman","Daspara",new StudentMarks(86,87)));
		al.add(new Student(1125,"Subrata","Sabang",new StudentMarks(75,100)));

		Iterator<Student> itr = al.iterator();
		
		if(StudentMarks.maths == 100)
		{
		while(itr.hasNext())
		{
			try 
			{
                  for(Student a : al)
                  {
				    System.out.println(a);
				    System.out.println("_____________");
				    studentcount++;			
                  }
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		System.out.println("Number Of Students are :- "+studentcount++);
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		Thread t = new Thread();
		((Assessment) t).centPercenter();
	}
	}



public class test14 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Grade g = new Grade();
		g.centPercenter();
		/*
		 * StudentDetails obj =new StudentDetails(); obj.studentCenturian();
		 */
    }


}
