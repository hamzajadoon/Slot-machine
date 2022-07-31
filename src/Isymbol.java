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
public interface Isymbol {
    
    public abstract void setImage(ImageIcon face);
    public abstract void setValue(int value);
    public abstract ImageIcon getImage();
    public abstract int getValue();
}
