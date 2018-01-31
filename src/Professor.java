
public class Professor 
{
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNum;
	
	public Professor(String firstName, String lastName, String email, int phoneNum)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	//SETTERS AND GETTERS
	public String getFirstName() 
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getName()
	{
		return(getFirstName() + " " + getLastName());
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public int getPhoneNum()
	{
		return this.phoneNum;
	}
	
	public void setPhoneNum(int phoneNum)
	{
		this.phoneNum = phoneNum;
	}
}
