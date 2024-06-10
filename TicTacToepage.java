
package registration;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TicTacToepage implements ActionListener{
    

    Random r= new Random();
    JFrame frame = new JFrame("TicTacToe");
    JPanel t_panel = new JPanel();
    JPanel b_Panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean p1_turn;
      public static void main(String[] args){
        TicTacToepage t = new TicTacToepage();
    }
    public TicTacToepage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new BorderLayout());
        
        frame.setVisible(true);
        
        
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(Color.RED);
        textfield.setFont(new Font("TimesNewRoman",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TicTacToe");
        textfield.setOpaque(true);
        
        t_panel.setLayout(new BorderLayout());
        t_panel.setBounds(0,0,800,100);
        
        b_Panel.setLayout(new GridLayout(3,3));
        b_Panel.setBackground(new Color(150,150,150));
        
        for(int i=0;i<9;i++){
            buttons[i] = new JButton();
            b_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
        
        t_panel.add(textfield);
        
        frame.add(t_panel,BorderLayout.NORTH);
        frame.add(b_Panel);
        
        firstTurn();
    }   
    
    public void firstTurn(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TicTacToepage.class.getName()).log(Level.SEVERE, null, ex);
//        }
        if(r.nextInt(2) == 0){
            p1_turn = true;
            textfield.setText("X TURN");
        }else{
            p1_turn = false;
            textfield.setText("O TURN");
        }
        
    
    }
    
    public void check(){
        if((buttons[0].getText()=="X")&& 
            (buttons[1].getText()=="X") &&
            (buttons[2].getText()=="X")){
            xWins(0,1,2);
        }
        
        if((buttons[3].getText()=="X")&& 
            (buttons[4].getText()=="X") &&
            (buttons[5].getText()=="X")){
            xWins(3,4,5);
        }
        
        if((buttons[6].getText()=="X")&& 
            (buttons[7].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(6,7,8);
        }
        
        if((buttons[0].getText()=="X")&& 
            (buttons[3].getText()=="X") &&
            (buttons[6].getText()=="X")){
            xWins(0,3,6);
        }
        
        if((buttons[1].getText()=="X")&& 
            (buttons[4].getText()=="X") &&
            (buttons[7].getText()=="X")){
            xWins(1,4,7);
        }
        
        if((buttons[2].getText()=="X")&& 
            (buttons[5].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(2,5,8);
        }
        
        if((buttons[0].getText()=="X")&& 
            (buttons[4].getText()=="X") &&
            (buttons[8].getText()=="X")){
            xWins(0,4,8);
        }
        
        if((buttons[2].getText()=="X")&& 
            (buttons[4].getText()=="X") &&
            (buttons[6].getText()=="X")){
            xWins(2,4,6);
        }
    
        
        //O wins
        if((buttons[0].getText()=="O")&& 
            (buttons[1].getText()=="O") &&
            (buttons[2].getText()=="O")){
            oWins(0,1,2);
        }
        
        if((buttons[3].getText()=="O")&& 
            (buttons[4].getText()=="O") &&
            (buttons[5].getText()=="O")){
            oWins(3,4,5);
        }
        
        if((buttons[6].getText()=="O")&& 
            (buttons[7].getText()=="O") &&
            (buttons[8].getText()=="O")){
            oWins(6,7,8);
        }
        
        if((buttons[0].getText()=="O")&& 
            (buttons[3].getText()=="O") &&
            (buttons[6].getText()=="O")){
            oWins(0,3,6);
        }
        
        if((buttons[1].getText()=="O")&& 
            (buttons[4].getText()=="O") &&
            (buttons[7].getText()=="O")){
            oWins(1,4,7);
        }
        
        if((buttons[2].getText()=="O")&& 
            (buttons[5].getText()=="O") &&
            (buttons[8].getText()=="O")){
            oWins(2,5,8);
        }
        
        if((buttons[0].getText()=="O")&& 
            (buttons[4].getText()=="O") &&
            (buttons[8].getText()=="O")){
            oWins(0,4,8);
        }
        
        if((buttons[2].getText()=="O")&& 
            (buttons[4].getText()=="O") &&
            (buttons[6].getText()=="O")){
            oWins(2,4,6);
        }
    
    };
    
    public void xWins(int a,int b, int c){
        buttons[a].setBackground(Color.BLUE);
        buttons[b].setBackground(Color.BLUE);
        buttons[c].setBackground(Color.BLUE);
        
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("X Wins");
    };
    
    public void oWins(int a,int b,int c){
        buttons[a].setBackground(Color.RED);
        buttons[b].setBackground(Color.RED);
        buttons[c].setBackground(Color.RED);
        
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("O Wins");
    };
    
    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<9;i++){
            if(e.getSource() == buttons[i]){
                if(p1_turn){
                    if(buttons[i].getText() =="" ){
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("X");
                        p1_turn=false;
                        textfield.setText("O TURN");
                        check();
                    }
                }else{
                    buttons[i].setForeground(Color.RED);
                    buttons[i].setText("O");
                    p1_turn=true;
                    textfield.setText("X TURN");
                    check();
                    
            }
        }
    }
 }
  
}
