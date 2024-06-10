package registration;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel chooseLabel = new JLabel("Choose an option:");
    JButton calculatorButton = new JButton("Calculator");
    JButton ticTacToeButton = new JButton("Tic Tac Toe");

    public WelcomePage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        
        chooseLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        chooseLabel.setBounds(120, 50, 200, 50);

       
        calculatorButton.setBounds(100, 150, 200, 50);
        calculatorButton.setFont(new Font("Arial", Font.PLAIN, 15));
        calculatorButton.addActionListener(this);

        ticTacToeButton.setBounds(100, 220, 200, 50);
        ticTacToeButton.setFont(new Font("Arial", Font.PLAIN, 15));
        ticTacToeButton.addActionListener(this);

        frame.add(chooseLabel);
        frame.add(calculatorButton);
        frame.add(ticTacToeButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculatorButton) {
            calculatorpage1 c =new calculatorpage1(); 
            frame.dispose();
        }
        if (e.getSource() == ticTacToeButton) {
            TicTacToepage t = new TicTacToepage(); 
            frame.dispose();
        }
    }

 
}
