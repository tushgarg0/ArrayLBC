/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.awt.*;
import javafx.scene.control.CheckBox;
public class awt {
    public static void main(String[] args) {
        Frame frame =new Frame ("this is Frmae");
        Panel panel=new Panel();
        Button b =new Button("click me ");
        CheckBox c1 =new CheckBox ("devansh is great");
        c1.resize(50,50);
        frame.resize(500,500);
        frame.setBackground(Color.yellow);
        frame.setLayout(null);
       
        panel.setBackground(Color.red);
        b.setBounds(150,150,20,30);
        frame.add(b);
        frame.add(panel);
        frame.show();
       
    }
    
}
