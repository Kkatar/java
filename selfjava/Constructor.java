class Human
{
    private int age;
    private String name;
    
    public Human() // default constructor
    {
        System.out.println("hi i am default contructor");
        age =12;
        name="atharva";
    }
    public Human(int a,String n)
    {
        age=a;
        name=n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
public class Constructor
{
    public static void main(String a[])
    {
        Human obj=new Human();
        Human obj1=new Human();
        System.out.println(obj.getAge()  + " : " + obj.getName());
        System.out.println(obj1.getAge() + ":" +obj.getName());
    }

}