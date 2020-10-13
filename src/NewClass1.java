
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass1 {
    
    public static void main(String[] args) {
        
    
    
    int i,j,k;
    
    
    for(i=3;i<=100;i++)
    {
        boolean l=true;
    for(j=2;j<=i/2;j++)
    {
        if(i%j==0)
        {
            l =false;
            break;
            
        }
    
    }
        if(l==true)
        System.out.println(" "+i);
    }
    
}
}