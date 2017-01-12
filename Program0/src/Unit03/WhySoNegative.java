package Unit03;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
Author: Andy Zheng
Date Created 1/11/17
*/
public class WhySoNegative {
    int[] lilyTextBoxContent = new int[5];
    int count = 0;
    JFrame lilyFrame = new JFrame("Lily!");
    JPanel lilyPanel;
    JLabel lilyLabel;
    JButton lilyButton0; JButton lilyButton1; JButton lilyButton2; JButton lilyButton3; JButton lilyButton4;
    ImageIcon lilyIcon;
    public static void main(String[] args) throws MalformedURLException {
        WhySoNegative Lily = new WhySoNegative();
        Lily.createLily();
    }
    public void createLily() throws MalformedURLException{
        lilyFrame.setResizable(true);
        lilyFrame.setIconImage(new ImageIcon("M:\\Images\\ChiakiIcon.jpg").getImage());
        lilyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilyFrame.setLocationRelativeTo(null);
        lilyFrame.setVisible(true);
        lilyPanel = new JPanel();
        lilyLabel = new JLabel();
        lilyIcon = new ImageIcon(new URL("http://p3.i.ntere.st/124456d5a5ab0a0e3d8cf84ac6639870_480.jpg"));
        lilyLabel.setIcon(lilyIcon);
        lilyPanel.add(lilyLabel);
        lilyPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        lilyButton0 = new JButton("Integer 1");
            lilyButton0.setActionCommand("0");
            lilyButton0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int buttonNumber = Integer.parseInt(ae.getActionCommand());
                lilyTextBoxContent[buttonNumber] = Math.abs(Integer.parseInt((String) JOptionPane.showInputDialog(lilyFrame, "Input negative number: ", "LilyInput", JOptionPane.PLAIN_MESSAGE, null, null, null)));
            }
        });
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            constraints.gridy = -1;
            lilyPanel.add(lilyButton0, constraints);
        lilyButton1 = new JButton("Integer 2");
            lilyButton1.setActionCommand("1");
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            constraints.gridy = -2;
            lilyButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int buttonNumber = Integer.parseInt(ae.getActionCommand());
                lilyTextBoxContent[buttonNumber] = Math.abs(Integer.parseInt((String) JOptionPane.showInputDialog(lilyFrame, "Input negative number: ", "LilyInput", JOptionPane.PLAIN_MESSAGE, null, null, null)));            }
        });
            lilyPanel.add(lilyButton1, constraints);
        lilyButton2 = new JButton("Integer 3");
            lilyButton2.setActionCommand("2");
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            constraints.gridy = -3;
            lilyButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int buttonNumber = Integer.parseInt(ae.getActionCommand());
                lilyTextBoxContent[buttonNumber] = Math.abs(Integer.parseInt((String) JOptionPane.showInputDialog(lilyFrame, "Input negative number: ", "LilyInput", JOptionPane.PLAIN_MESSAGE, null, null, null)));            }
        });
            lilyPanel.add(lilyButton2, constraints);
        lilyButton3 = new JButton("Integer 4");
            lilyButton3.setActionCommand("3");
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 2;
            constraints.gridy = -1;
            lilyButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int buttonNumber = Integer.parseInt(ae.getActionCommand());
                lilyTextBoxContent[buttonNumber] = Math.abs(Integer.parseInt((String) JOptionPane.showInputDialog(lilyFrame, "Input negative number: ", "LilyInput", JOptionPane.PLAIN_MESSAGE, null, null, null)));            }
        });
            lilyPanel.add(lilyButton3, constraints);
        lilyButton4 = new JButton("Integer 5");
            lilyButton4.setActionCommand("4");
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 2;
            constraints.gridy = -2;
            lilyButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int buttonNumber = Integer.parseInt(ae.getActionCommand());
                lilyTextBoxContent[buttonNumber] = Math.abs(Integer.parseInt((String) JOptionPane.showInputDialog(lilyFrame, "Input negative number: ", "LilyInput", JOptionPane.PLAIN_MESSAGE, null, null, null)));            }
        });
            lilyPanel.add(lilyButton4, constraints);
        lilyButton1 = new JButton("Submit");
            lilyButton1.setActionCommand("Submit");
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 2;
            constraints.gridy = -3;
            lilyButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(lilyFrame, "Why are you so negative? Here, let me help you: " + lilyTextBoxContent[0] + "    " + lilyTextBoxContent[1] + "    " + lilyTextBoxContent[2] + "   " + lilyTextBoxContent[3] + "    " + lilyTextBoxContent[4] + "    ");
            }});
            lilyPanel.add(lilyButton1, constraints);
            lilyFrame.setContentPane(lilyPanel);
            lilyFrame.setMinimumSize(new Dimension(300, 300));
            lilyFrame.pack();
    }
}
