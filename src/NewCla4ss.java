/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewCla4ss extends Thread
        
{
  @Override
  public  void  run()
  {
  
  for(int i=0;i<5;i++)
  {
      try
     {Thread.sleep(1000);
     }
     catch(Exception e)
     {
     e.printStackTrace();
     }
      System.out.println(i);
  }
  }
    
public static void main(String [] args)
{

    NewCla4ss e =new NewCla4ss();
        e.start();
 
}

}
