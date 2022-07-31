/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Hamza Jadoon
 */
public class Reel {
    private ArrayList<Symbol> symbol;
    
    public Reel(){
        Symbol one = null;
        Symbol two = null;
        Symbol three = null;
        Symbol four = null;
        Symbol five = null;
        Symbol six = null;
        
        // Instanciate the array list
        symbol = new ArrayList<Symbol>();
        
        try{
        one = new Symbol(1, new ImageIcon(getClass().getResource("bell.png")));
        }catch(NullPointerException e){
            System.out.println("The image 1 is not found");
        }
        try{
        two = new Symbol(2, new ImageIcon(getClass().getResource("cherry.png")));
        }catch(NullPointerException e){
            System.out.println("The image 2 is not found");
        }
        try{
        three = new Symbol(3, new ImageIcon(getClass().getResource("lemon.png")));
        }catch(NullPointerException e){
            System.out.println("The image 3 is not found");
        }
        try{
        four = new Symbol(4, new ImageIcon(getClass().getResource("plum.png")));
        }catch(NullPointerException e){
            System.out.println("The image 4 is not found");
        }
        try{
        five = new Symbol(5, new ImageIcon(getClass().getResource("redseven.png")));
        }catch(NullPointerException e){
            System.out.println("The image 5 is not found");
        }
        try{
        six = new Symbol(6, new ImageIcon(getClass().getResource("watermelon.png")));
        }catch(NullPointerException e){
            System.out.println("The image 6 is not found");
        }
        
        
        symbol.add(one);
        symbol.add(two);
        symbol.add(three);
        symbol.add(four);
        symbol.add(five);
        symbol.add(six);
    }
    
    public Symbol roll(){
        // retrieve a random image
        Random rand = new Random();
        int randomNum; 
        randomNum = rand.nextInt(symbol.size());
        
        return symbol.get(randomNum);
    }
    
   
}
