public class constructorchaining {
public static void main(String[]args)
{ 
    student st=new student();
}
a=45;
System.out.println("a="+a);    
}
class student
{
    student()
    { this(5);
        System.out.println("This is the default constructor");
    }
        student(int x)
        {
            this(x,10);
            System.out.println("x="+x);
        }
        student(int x,int y)
        {
            System.out.println("x="+x+"y"+y);
        }
        
}

