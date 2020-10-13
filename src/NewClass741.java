 /*/ To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
class NewClass741 {
    private int a=5;
    
 void setdev(int a)
 {  this.a=a;
     System.out.println(a);
 }         
void getde()
{  this.setdev(a);
    System.out.println(this.setdev());
}
   
   }
class Dwv extends NewClass741
{
    void de()
    { System.out.println(super.a);
    }
public static void main (String [] args)
{
   NewClass741 de =new NewClass741();
   de.setdev(15);
   de.getde();
   
}
}