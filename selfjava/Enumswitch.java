enum Status
{
    Running,Failed,Pending,Success;
}
public class Enumswitch
{
    public static void main(String a[])
    {
        Status s=Status.Running;
        switch(s)
        {
            case Running:
                System.out.println("all goods");
            break;
            case Failed:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("wait a minuute");
            break;
            case Success:
                System.out.println("done");
                break;
            default:
                System.out.println("invailllid input");
                break;         
        }
    }
}