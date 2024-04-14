package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    String name;
    Score(String name, int score){
        this.name=name;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you "+ name  +" for giving the quiz. Hope you enjoyed it!!" );
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is "+ score );
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(600, 150, 750, 550);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}