class A
{
    public A()
    {
        System.out.println("object created ");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}
public class Super
{
    public static void main(String args[])
    {
        new A().show();
        new A().show();
    }
}