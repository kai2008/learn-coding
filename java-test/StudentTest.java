class Student

{

	//public String name = "hello";
	private String name = "hello";

	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void printDetail()
	{
		System.out.println("Student s1: ");

	}
}

public class StudentTest
{

    public static void main ( String[] args ) 
    {
       Student s1 = new Student () ;
	//s1.name = "world";
        s1.setName("good");
       System.out.println("Student s1: "+s1.getName());
    }

} 

