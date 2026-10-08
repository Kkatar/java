import java.util.*;
class Person
{
    String name;
    int age;
    void accept()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        name=scanner.nextLine();
        System.out.println("enter your age:");
        age=scanner.nextInt();
        System.out.println("my name is " + name + " iam " + age + "years old");
    
    }
    void display()
    {
        System.out.println("my name is " + name + " iam " + age + "years old");
    }
}
class Student extends Person
{
    int rollno;
    int marks;
    
    
    void accept()
    {
     super.accept();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter rollno");
        rollno=scanner.nextInt();
        System.out.print("enter marks");
        marks=scanner.nextInt();
    }
    
    void display()
    {
        super.display();
        System.out.println(" rollno is " + rollno + " marks are " + marks);
    }
public static void main(String args[])
{
    Student obj=new Student();
    obj.accept();
    obj.display();
}
}