
import jdk.nashorn.internal.ir.CatchNode;


public class Thered extends Thread{
    
public void run()
{
    for(int i =0;i<5;i++)
    {
        System.err.println(Thered.currentThread().getName());
        try{
        Thread.sleep(100);
        }
       catch(Exception e)
            {
                System.err.println("error");
            }
        System.out.println(i);
    }
    
        };
public static void main(String[] args) {
        Thered t1 =new Thered();
        Thered t2 =new Thered();
        Thered t3 =new Thered();
       
   
        t1.start();
        t2.start();
        t3.start();
}

}
