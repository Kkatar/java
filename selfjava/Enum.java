enum Status
{
    Running,Failed,Pending,Success;
}
public class Enum
{
    public static void main(String a[])
    {
        Status s=Status.Running;
        if(s==Status.Running)
        
            System.out.println("all goods");
        
        else if(s==Status.Failed)
        
            System.out.println("try again");
        
        else if(s==Status.Pending)
        
            System.out.println("wait a minute ");
        
        
        else 
        
            System.out.println("done");
        
    }
}