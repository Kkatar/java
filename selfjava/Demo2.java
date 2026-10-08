enum Laptop
{
    mac(2000),xps(2200),asus(1500);
 private int price;
 Laptop(int price)
 {
     this.price=price;
 }
 public int getPrice()
 {
     return price;
 }
}

public class Demo2
{
    public static void main(String args[])
    {
        Laptop l=Laptop.asus;
      
        System.out.println( l+" - Price: "+l.getPrice());
    }
}   