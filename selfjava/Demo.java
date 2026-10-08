class Mobile
{
  String brand;
  int price;
  String name;
  public void show()
  {
    System.out.print(brand +" : " + price + " : " + name);
  }
}
public class Demo
{
    public static void main(String a[])
    {
        Mobile obj1= new Mobile();
        obj1.brand="apple";
        obj1.price=200000;
        obj1.name="iphone pro max";
        obj1.show();
    }
  
}