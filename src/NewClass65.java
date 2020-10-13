/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass65 implements Runnable
{

    @Override
    public int run() 
    {
        

     try
     {Thread.sleep(1000);
     }
     catch(Exception e)
     {
     e.printStackTrace();
     }
     for (int i=0 ;i<5;i++)
     {
    System.out.println("cddcd");
     }
return 0;
}
    public static void main(String[] args) {
        
        NewClass65 e =new NewClass65();
        Thread ee= new Thread();
        ee.start();
        
        System.out.println(run());
      
    }
}
