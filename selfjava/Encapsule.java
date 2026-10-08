class Human
{
    private int age=20;
    private String name="Piyush";
    
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
public class Encapsule
{
    public static void main(String a[])
    {
        Human obj1=new Human();
        System.out.print(obj1.getAge()  + " : " + obj1.getName());
    }
}