package asse1;

public class StudentMarks 
{
	int percent;
    static int maths;
	
	public StudentMarks() {}
	
	public StudentMarks(int percent, int maths) 
	{
		this.percent = percent;
		this.maths = maths;
	}
	
	public int getPercent() 
	{
		return percent;
	}
	public void setPercent(int percent) 
	{
		this.percent = percent;
	}
	
	public int getMaths() 
	{
		return maths;
	}
	public void setMaths(int maths)
	{
		this.maths = maths;
	}
	
	@Override
	public String toString() 
	{
		return "Percents :- " + percent + ",Maximum Marks In Maths Subject :- " + maths+"\n";
	}

	
}

