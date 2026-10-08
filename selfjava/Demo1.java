class Human
{
    int age;
    String name;
    public void show()
    {
        System.out.print(age + " : " + name);
    }
}
    public class Demo1
    {
        public static void main(String a[])
        {
            Human obj1= new Human();
            obj1.age=20;
            obj1.name="Piyush";
            obj1.show();
        }
    }
