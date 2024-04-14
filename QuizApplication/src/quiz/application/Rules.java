package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    Rules(String name){
        this.name=name;

        JLabel heading = new JLabel("Welcome "+name+" to Quiz Application");
        heading.setBounds(50, 20, 700,30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(30, 70, 700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rules.setText(
                "<html>"+
                        "1. Each of the ten questions has a strict time limit of 15 seconds. Participants must submit their answers within this timeframe." + "<br><br>" +

                        "2. Answers must be submitted promptly within the 15-second time limit. Responses received after the time expires will not be considered." + "<br><br>" +

                        "3. There are no extensions to the time limit. Once the 15 seconds are up, the question proceeds to the next regardless of whether the participant has answered." + "<br><br>" +

                        "4. Participants are granted one 50-50 lifeline to use throughout the quiz. This lifeline removes two incorrect options, leaving one correct answer and one incorrect answer." + "<br><br>" +

                        "5. Participants must announce their decision to use the 50-50 lifeline before answering the question. Once the lifeline is activated, it cannot be reversed." + "<br><br>" +

                        "6. Participants must avoid interrupting or distracting others during the quiz. Any disruptive behavior may lead to disqualification." + "<br><br>" +

                        "7. Participants must answer questions independently without any external assistance. Collaboration or cheating will result in immediate disqualification." + "<br><br>" +

                        "8.  At the end of the quiz, participants' scores will be displayed immediately on the next page. This allows participants to see their performance right away." + "<br><br>" +
                "<html>");
        add(rules);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
