
import java.io.FileInputStream;
import java.io.FileOutputStream;
import jdk.nashorn.internal.ir.CatchNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass5 {
    public static void main(String[] args) 
    
    {

       try(FileInputStream gish =new FileInputStream("e:\\dev.text");)
     
     {         FileOutputStream fis =new FileOutputStream("e:\\Devanshh");
         int i;
        while((i=gish.read())!=-1)
        {
            System.out.print((char)i);
            fis.write(i);
        
        }
         
     
     }
     catch(Exception ee)
         {
             ee.printStackTrace();
         }   
     
    }

    
}
