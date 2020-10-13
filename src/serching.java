/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class serching {
    public static void main(String[] args) {
        int [] a={1,4,1,3,2,3,24};
        int l= Integer.MAX_VALUE;
        int ls=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<l)
            {
            ls=l;
            l=a[i];
            }
            else if(a[i]<ls&&a[i]!=l)
            {
            ls=a[i];
            
            }
        }
        System.out.println(l);
        System.out.println(ls);
        
    }
    
}
