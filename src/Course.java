
public class Course 
{
	private String name;
	private int num;
	private int credit;
	private Professor prof;
	
	public Course(String name, int num, int credit, Professor prof)
	{
		this.name = name;
		this.num = num;
		this.credit = credit;
		this.prof = prof;
	}
	
	//SETTERS AND GETTERS
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getNum() 
	{
		return this.num;
	}
	
	public void setNum(int num) 
	{
		this.num = num;
	}
	
	public int getCredit() 
	{
		return this.credit;
	}
	
	public void setCredit(int credit) 
	{
		this.credit = credit;
	}
	
	public String getProf() 
	{
		return this.prof.getName();
	}
	
	public void setProf(Professor prof) 
	{
		this.prof = prof;
	}
}
