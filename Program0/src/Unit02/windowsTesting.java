package Unit02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

/*
Author: Andy Zheng
Date Created: 1/3/17
*/
public class windowsTesting extends JFrame implements ActionListener{
    JPanel lilyPanel; JLabel lilyLabel; ImageIcon chiakiIcon;
    BufferedImage chiaki;
    JButton lilyButton0; JButton lilyButton1;
    
    public static void main(String[] args) throws IOException {
        windowsTesting lily = new windowsTesting();
    }
    public JPanel createJPanel(int placeholder0){   
        setLayout(new GridBagLayout());
        lilyPanel = new JPanel(); 
        lilyPanel.setLayout(new GridBagLayout());
        add(this.createJLabel(placeholder0));
        return lilyPanel;
    }
    public JLabel createJLabel(int placeholder1){
        lilyLabel = new JLabel();
        lilyLabel.setIcon(this.createImageIcon(placeholder1));
        return lilyLabel;
    }
    public String getChiakiLocation(int pic){
        String[] chiakiLocation = new String[3];
        chiakiLocation[0] = "M:\\Images\\ChiakiIcon.jpg";
        chiakiLocation[1] = "M:\\Images\\Chiaki.jpg";
        chiakiLocation[2] = "M:\\Images\\ChiakiNeko.jpg";
        return chiakiLocation[pic];
    }
    public ImageIcon createImageIcon(int placeholder2){
        chiakiIcon = new ImageIcon(this.getChiakiLocation(placeholder2));
        return chiakiIcon;
    }
    public windowsTesting() throws MalformedURLException, IOException {    
        super("Lily");
        setResizable(false);
        setIconImage(this.createImageIcon(0).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.setLocationRelativeTo(null);
        add(this.createJPanel(1));
        //this.addButton();
        this.addMenu();
        pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String buttonAction = e.getActionCommand();
        switch(buttonAction){
            case "Greeting":
                JOptionPane.showMessageDialog(this, "Hi!", "OK", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Next Image":
                this.nextImage();
                this.setLocationRelativeTo(null);
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }
    public void nextImage(){    
        lilyLabel.setIcon(this.createImageIcon(2));
        addMenu();
        pack();
    }
    public void addButton(){
        GridBagConstraints constraints = new GridBagConstraints();
        lilyButton0 = new JButton("Hello!");
            lilyButton0.setActionCommand("Greeting");
            lilyButton0.addActionListener(this);
            constraints.fill = GridBagConstraints.BOTH;
            constraints.gridx = GridBagConstraints.EAST;
            constraints.gridy = 0;
            lilyPanel.add(lilyButton0, constraints);
        lilyButton1 = new JButton("Ohayo");
            lilyButton1.setActionCommand("Next Image");
            constraints.fill = GridBagConstraints.BOTH;
            constraints.gridx = GridBagConstraints.EAST;
            constraints.gridy = -1;
            lilyButton1.addActionListener(this);
            lilyPanel.add(lilyButton1, constraints);
    }
    public void removeButton(){
        lilyPanel.remove(lilyButton0);
        lilyPanel.remove(lilyButton1);
    }
    public void addMenu(){
        JMenuBar lilyBar = new JMenuBar();
        lilyBar.setLayout(new BorderLayout());
        JMenu lilyFile = new JMenu("File");
        JMenuItem lilyExit = new JMenuItem("Exit");
        JMenuItem lilyNextImage = new JMenuItem("Next Image");
        lilyExit.addActionListener(this);
        lilyNextImage.addActionListener(this);
        lilyFile.add(lilyExit);
        lilyFile.add(lilyNextImage);
        lilyBar.add(lilyFile);
        setJMenuBar(lilyBar);
    }
}
