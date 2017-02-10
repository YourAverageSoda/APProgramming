package Unit04;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
Author: Andy Zheng
Date Created 1/24/17
*/
public class MyMasterpiece extends Canvas implements ActionListener{
    public static void main(String[] args) {
        JFrame lilyFrame = new JFrame("Lily's Canvas");
        JMenu lilyMenu = new JMenu("File");
        JMenuItem lilyExit = new JMenuItem("Exit");
        JMenuBar lilyMenuBar = new JMenuBar();
        MyMasterpiece aLilyInTheDawn = new MyMasterpiece();
        lilyFrame.setVisible(true);
        aLilyInTheDawn.setSize(400,400);
        aLilyInTheDawn.setBackground(Color.decode("#d4eff9"));
        aLilyInTheDawn.repaint();
        lilyFrame.setMinimumSize(new Dimension(400,400));
        lilyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilyExit.setActionCommand("EXIT");
        lilyExit.addActionListener(aLilyInTheDawn);
        lilyMenu.add(lilyExit);
        lilyMenuBar.add(lilyMenu);
        lilyFrame.setJMenuBar(lilyMenuBar);
        lilyFrame.add(aLilyInTheDawn);
        lilyFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("EXIT")){
            System.exit(0);
        }
    }
    @Override
    public void paint(Graphics g){        
        paintRect(g);
        paintLily(g);
        paintSun(g);
    }
    public void paintRect(Graphics g){
        g.setColor(Color.decode("#0b490b"));
        g.fillRect(0, 240, 400, 160);
        g.setColor(Color.decode("#bc7f1c"));
        g.fillRect(95, 200, 10, 50);
        g.drawRect(50, 150, 100, 50);
        g.fillRect(50, 150, 100, 50);
        g.setColor(Color.decode("#ffffff"));
        g.fillRect(80, 170, 40, 20);
        g.setColor(Color.decode("#000000"));
        g.drawString("Hello!", 85, 185);
    }
    public void paintLily(Graphics g){
        g.setColor(Color.decode("#f7eff1"));
        g.drawOval(336, 190, 10, 20);
        g.fillArc(329, 189, 25, 21, 140, 120);
        g.fillArc(329, 189, 25, 21, 240, 150);
        g.setColor(Color.decode("#40a508"));
        g.fillArc(329, 206, 25, 18, 145, 250);
        g.setColor(Color.decode("#296d04"));
        g.drawArc(329, 200, 25, 21, 170, 210);
        g.drawArc(329, 194, 25, 21, 200, 135);
        g.setColor(Color.decode("#2e7c03"));
        g.drawLine(340, 210, 340, 250);
        g.drawLine(341, 210, 341, 250);
        g.drawLine(342, 210, 342, 250);
    }
    public void paintSun(Graphics g){
        g.setColor(Color.decode("#f7dd1b"));
        g.fillOval(320, 10, 50, 50);
        g.setColor(Color.decode("#ffff1e"));
        g.drawLine(310, 35, 270, 35);
        g.drawLine(312, 45, 275, 58);
        g.drawLine(319, 59, 291, 87);
        g.drawLine(330, 67, 318, 102);
        g.drawLine(345, 70, 345, 110);
    }

}
