/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;       // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers
import javax.swing.JOptionPane;
/**
 *
 * @author Hamza Jadoon
 */
public class SymbolFrame extends JFrame{
    
    JLabel LBLCreditArea;      
    JTextField TFCreditArea;
    JTextField TFAmount;
    JButton BTNAddCoin; 
    JButton BTNBetOne;  
    JButton BTNBetMax;
    JButton BTNSpin;
    JButton BTNReset;
    JButton BTNStat;
    JTextField TXFValue;
    JTextField TXFValue2;
    JTextField TXFValue3;
    JLabel LBLImage;
    JLabel LBLImage2;
    JLabel LBLImage3;
    Reel reel;
    int Credits = 10;
    int Amount = 0;    
    int NumberOfWins;
    int NumberOfLoses;
    JTextField TXFWin;
    JTextField TXFLoses;
    JTextField TXFAverage;
    JLabel LBLWinArea;
    JLabel LBLLoseArea;
    int Counter;
    int Average;
    JLabel LBLgameStats;

     public SymbolFrame(){
      
      Container cp = getContentPane();
      // set layout in the main panel
      cp.setLayout(new BorderLayout());
      cp.setBackground(Color.orange);
      
      //Each button number, however it is hidden for user interface.
      JPanel p1 = new JPanel();
      p1.setBackground(Color.orange);
      TXFValue = new JTextField("");
      TXFValue.setVisible(false);
      TXFValue.setEditable(false);
      p1.add(TXFValue);
      
      TXFValue2 = new JTextField("");
      TXFValue2.setVisible(false);
      TXFValue2.setEditable(false);
      p1.add(TXFValue2);
     
      TXFValue3 = new JTextField("");
      TXFValue3.setVisible(false);
      TXFValue3.setEditable(false);
      p1.add(TXFValue3);
      cp.add(p1, BorderLayout.CENTER);
        //create a label to display the image
      
      LBLImage = new JLabel("", JLabel.CENTER);
     
      p1.add(LBLImage, BorderLayout.CENTER);
      
      LBLImage2 = new JLabel("", JLabel.CENTER);
     
      p1.add(LBLImage2, BorderLayout.CENTER);
    
      LBLImage3 = new JLabel("", JLabel.CENTER);
     
      p1.add(LBLImage3, BorderLayout.CENTER);
      
      
      //3 images for the spin, also the height and width is controlled here
      
      LBLImage = new JLabel("", JLabel.CENTER);
      LBLImage.setPreferredSize(new Dimension(400, 400));
      p1.add(LBLImage, BorderLayout.CENTER);
      
      LBLImage2 = new JLabel("", JLabel.CENTER);
      LBLImage2.setPreferredSize(new Dimension(400, 400));
      p1.add(LBLImage2, BorderLayout.CENTER);
    
      LBLImage3 = new JLabel("", JLabel.CENTER);
      LBLImage3.setPreferredSize(new Dimension(400, 400));
      p1.add(LBLImage3, BorderLayout.CENTER);

      //Buttons that function the game
      JPanel p2 = new JPanel();
      
      BTNSpin = new JButton("Spin");
      p2.add(BTNSpin);
      
      BTNAddCoin = new JButton("Add Coin");
      p2.add(BTNAddCoin);
      
      TFCreditArea = new JTextField(Credits + "", 10);
      TFCreditArea.setEditable(false);
      p2.add(TFCreditArea);
      
      LBLCreditArea = new JLabel("Number of credits"); // Construct component Label
      p2.add(LBLCreditArea);
      
      BTNBetOne = new JButton("Bet One"); // Construct component Button
      p2.add(BTNBetOne);
       
      BTNBetMax = new JButton("Bet Maximum"); // Construct component Button
      p2.add(BTNBetMax);
    
      BTNReset = new JButton("Reset");
      p2.add(BTNReset);
      
      TFAmount = new JTextField("Bets Placed");
      TFAmount.setEditable(false);
      p2.add(TFAmount);
      
      BTNStat= new JButton("Statistics"); // Construct component Button
      p2.add(BTNStat);
      cp.add(p2, BorderLayout.NORTH);
  
      reel = new Reel();
      Isymbol symbol1 = reel.roll();
      
      //First image of the spin
      // set the image to display and the value when the user run the application for the firs time
      LBLImage.setIcon(symbol1.getImage());
      TXFValue.setText(Integer.toString(symbol1.getValue()));

      // Second image of the spin
      // set the image to display and the value when the user run the application for the firs time
      LBLImage2.setIcon(symbol1.getImage());
      TXFValue2.setText(Integer.toString(symbol1.getValue()));
     
      //Third image of the spin
      LBLImage3.setIcon(symbol1.getImage());
      TXFValue3.setText(Integer.toString(symbol1.getValue()));
      
      // Event handlers
      MyListener myListener = new MyListener();
      BTNSpin.addActionListener(myListener);
      BTNAddCoin.addActionListener(myListener);
      BTNBetOne.addActionListener(myListener);
      BTNBetMax.addActionListener(myListener);
      BTNReset.addActionListener(myListener);
      BTNStat.addActionListener(myListener);
      
      
         }


   
    public void run() { 
        }
   
         
     private class MyListener implements ActionListener{
     
      public void actionPerformed(ActionEvent evt) {
           String btnLabel = evt.getActionCommand();
// event.getActionCommand() returns the button's label
           if (btnLabel.equals("Spin")){
               --Credits;
               TFCreditArea.setText(Credits + "");
               
               Symbol face = reel.roll();
        // set the image to display and the value when the user run the application for the firs time
        LBLImage.setIcon(face.getImage());
        TXFValue.setText(Integer.toString(face.getValue()));
        
        Symbol face1 = reel.roll();
        LBLImage2.setIcon(face1.getImage());
        TXFValue2.setText(Integer.toString(face1.getValue()));
       
        Symbol face2 = reel.roll();
        LBLImage3.setIcon(face2.getImage());
        TXFValue3.setText(Integer.toString(face2.getValue()));
        
        String a = TXFValue.getText();
        int h = Integer.parseInt(a);
        
              System.out.println(a);
              
              String b = TXFValue2.getText();
              int h1 = Integer.parseInt(b);
              
               System.out.println(b);
               
                String a1 = TFAmount.getText();
                int h2 = Integer.parseInt(a1);
                
                String a2 = TXFValue3.getText();
                int h3 = Integer.parseInt(a2);
               
               
             if((h == h1)&& (h1 == h3) || (h == h1) || (h1 == h3) || (h == h3)){
                    JOptionPane.showMessageDialog(null, "You Win.");
                    NumberOfWins = NumberOfWins + 1;
             }
                    else  {
                    JOptionPane.showMessageDialog(null, "You Lose.");
                    NumberOfLoses = NumberOfLoses + 1;
                    Average = 0;
                }
                     
                   
             if((h == 6) && (h1 == 6) && (h3 == 6 ) || (h == 6) && (h1 == 6) || (h1 == 6) && (h3 == 6) || (h == 6) && (h == 6)){
                         int watermelon = h2 * 5;
                         
             
                 Credits = Credits + watermelon;
                 TFCreditArea.setText(Credits + "");
                 Average = Average + watermelon;  // storing the bonus values in another variable to find the average
                         Counter++;
                    }     
                    
             else if((h == 5) && (h1 == 5) && (h3 == 5 ) || (h == 5) && (h1 == 5) || (h1 == 5) && (h3 == 5) || (h == 5) && (h3 == 5)){
                         int redSeven = h2 * 7;
             
                 Credits = Credits + redSeven;
                 TFCreditArea.setText(Credits + "");
                 Average = Average + redSeven;
                         Counter++;
                    }
                    
               else if((h == 4) && (h1 == 4) && (h3 == 4 ) || (h == 4) && (h1 == 4) || (h1 == 4) && (h3 == 4) || (h == 4) && (h3 == 4)){                                                        
                        int plum = h2 * 4;
                  
                 Credits = Credits + plum;
                 TFCreditArea.setText(Credits + "");      
                        Average = Average + plum;
                        Counter++;
                    }
                    
                else if((h == 3) && (h1 == 3) && (h3 == 3 ) || (h == 3) && (h1 == 3) || (h1 == 3) && (h3 == 3) || (h == 3) && (h3 == 3)){ 
                        int lemon = h2 * 3;
                  
                 Credits = Credits + lemon;
                 TFCreditArea.setText(Credits + ""); 
                 Average = Average + lemon;
                        Counter++;
                    }
                
                else if  ((h == 2) && (h1 == 2) && (h3 == 2 ) || (h == 2) && (h1 == 2) || (h1 == 2) && (h3 == 2) || (h == 2) && (h3 == 2))   {
                  int cherry = h2 * 2;
                    
                  Credits = Credits + cherry;
                 TFCreditArea.setText(Credits + "");
                 Average = Average + cherry;
                  Counter++;
                    
                }
                else if  ((h == 1) && (h1 == 1) && (h3 == 1 ) || (h == 1) && (h1 == 1) || (h1 == 1) && (h3 == 1) || (h == 1) && (h3 == 1))   {
                  int bell = h2 * 6;
                    
                 Credits = Credits + bell;
                 TFCreditArea.setText(Credits + "");
                 Average = Average + bell;
                  Counter++;
                    
               }

           }
            if(btnLabel.equals("Add Coin")){
                 ++Credits;
                 TFCreditArea.setText(Credits + "");
            }
            
            if(Credits <= 0){
                JOptionPane.showMessageDialog(null, "No credit.");
                
            }
            if(btnLabel.equals("Bet One")){
            --Credits;
             TFCreditArea.setText(Credits + ""); 
             ++Amount;
             TFAmount.setText(Amount + "");

            }
            
             if (btnLabel.equals("Bet Maximum")){
             Credits = Credits - 3;
             TFCreditArea.setText(Credits + "");
             Amount = Amount + 3;
             TFAmount.setText(Amount + "");
             BTNBetMax.setEnabled(false);
          //   String a1 = tfAmount.getText();
          //   int k2 = Integer.parseInt(a1);
             
           //      System.out.println(k2);
    }
             if (btnLabel.equals("Reset")){
            Credits = 10;
            TFCreditArea.setText(Credits + "");
            Amount = 0;
            TFAmount.setText(Amount + "");
    }
            if (btnLabel.equals("Statistics")){
               
                JFrame stats = new JFrame();    // create new frame
                stats.setSize(1000,500);       
                stats.setTitle("Statistics");      // "super" Frame sets title
             
                stats.setVisible(true); 
                
                stats.setLayout(new BorderLayout());
                
                JPanel kr = new JPanel();
                kr.setBackground(new Color(173,216,230));
                stats.add(kr);
                
                JPanel p2 = new JPanel();  // create new panel to add components
                p2.setBackground(Color.white);
                LBLgameStats = new JLabel("Game Stats");
                p2.add(LBLgameStats);
                
                stats.add(p2,BorderLayout.NORTH); // add the pannel to the frame
                
              LBLWinArea = new JLabel("Number Of Wins"); // Construct component Label
              kr.add(LBLWinArea);
                
                TXFWin = new JTextField("", 5);  // Construct component Label
                kr.add(TXFWin);
          
              TXFWin.setText(NumberOfWins + "");  // sets the text to number of wins
              
              LBLLoseArea = new JLabel("Number Of Loses"); // Construct component Label
              kr.add(LBLLoseArea);
              
              TXFLoses = new JTextField("", 5);  // Construct component Label
              kr.add(TXFLoses);
              
              TXFLoses.setText(NumberOfLoses + ""); // sets the text to number of loses
              
              LBLLoseArea = new JLabel("Average Number Of Credits"); // Construct component Label
              kr.add(LBLLoseArea);
              
              TXFAverage = new JTextField("", 5);  // Construct component Label
              kr.add(TXFAverage);
              
              TXFAverage.setText(Average/Counter + "");  // calculates the average and displays it in textfield
              
              stats.add(kr);  // adding components of panel to the frame
          
    }
            
      }
     
     }
     
     
     public static void main(String[] args) {
        // Invoke the constructor by allocating an anonymous instance
      SymbolFrame myFrame = new SymbolFrame();
      
      myFrame.setSize(1000, 600);       // "super" Frame sets initial size
      myFrame.setTitle("Bet game");           // "super" Frame sets title
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);                  // show "super" Frame 
    }   
     }
     
     // TODO code application logic here

