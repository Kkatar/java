class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }

}
public class Demc
{
    public static void main(String a[])
    {
        Calc obj=new Calc();
        int r1=obj.add(3,2);
        int r2=obj.sub(3,2);
        System.out.println(r1 + "   " + r2);
    }
} 