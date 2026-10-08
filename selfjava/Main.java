abstract class Shape
{
     abstract double calculateArea();
     void display()
    {

    }
    
}
class Circle extends Shape
    {
        double radius;
        public Circle(double r)
        {
            radius = r;
        }    
          double calculateArea()
        {
            return 3.14*radius*radius;
        }
        void display()
        {
            System.out.println("Area of Circle is: "+calculateArea());
        }
    } 
class Rectangle extends Shape
{
    double length, width;
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    double calculateArea()
    {
        return length*width;
    }
    void display()
    {
        System.out.println("Area of Rectangle is: "+calculateArea());
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        c.display();
        Rectangle r = new Rectangle(4, 6);
        r.display();
    }
}