
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass52 {
    
    
    public static void main(String[] args) {
        
        
        FileInputStream fis=null;
        FileOutputStream fis1=null;
                int a;
                byte [] b;
                try
                {
                    String d="Deva ";
                      b=d.getBytes();
                    fis1 =new FileOutputStream("e:\\Devansh.text");
                    fis1.write(b);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                   try
                   {fis1.close();
                   }
                   catch(IOException we)
                   {
                       we.printStackTrace();
                   }
                }
        
    }

    
}
