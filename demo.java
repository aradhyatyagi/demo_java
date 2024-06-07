class demo {
    public static void main(String[] args)
	{
	    Student s1= new Student();
	    s1.setName("xyz");
		s1.getName();
		
		
	}
}
class Student
 {
     int rollno;
     int age;
     String name;
void getName()
    {
        System.out.println("Name"+name);
    }
void setName(String sname)
    {
        name= sname;
    }
 }