@FunctionalInterface
interface A
{
    int add(int i,int j);
}
public class Func

{
     obj =(int i,int j)->i+j;
     int r=obj.add(10,20);
     System.out.println(r);

}