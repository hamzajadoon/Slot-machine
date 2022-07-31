/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;       
import java.awt.event.*; 
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Hamza Jadoon
 */
public class Symbol implements Isymbol {
     
    private int Value;
    private ImageIcon FaceImage; 
     
    public Symbol(){
        Value = 0;
        FaceImage = null;
    }
    
     public Symbol(int value, ImageIcon faceimage){
        this.Value = value;
        this.FaceImage = faceimage;
    }
    
    public void setImage(ImageIcon FaceImage){
        this.FaceImage = FaceImage;
    }
    
    public void setValue(int Value){
        this.Value = Value;
    }
    
     public ImageIcon getImage(){
        return FaceImage;
    }
     
     public int getValue(){
        return Value;
    }
}
