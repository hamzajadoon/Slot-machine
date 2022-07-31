/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.awt.*;       // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*;
/**
 *
 * @author Hamza Jadoon
 */
public class MyWorker extends SwingWorker<Boolean, Integer>{
     JLabel Imageicon;
     
     public MyWorker(JLabel Imageicon){
        this.Imageicon = Imageicon ;
    }
     
       protected Boolean doInBackground() throws Exception {
         // Simulate doing something useful.

         for (int i = 0; i <= 10; i++) {
             System.out.println("Running " + i);
             publish(i);
             Thread.sleep(1000);
         }

         return true;
     }
    
     
}
