package Unit02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
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
    public ImageIcon chiakiIcon = new ImageIcon("M:\\Images\\ChiakiIcon.jpg");
    public ImageIcon chiaki = new ImageIcon("M:\\Images\\Chiaki.jpg");
    public ImageIcon chiaki1 = new ImageIcon("M:\\Images\\ChiakiNeko.jpg");
    
    /*static JFrame lily = new JFrame("Lily");
    public static void main(String[] args) throws MalformedURLException, IOException {
        ImageIcon chiakiIcon = new ImageIcon("M:\\Images\\ChiakiIcon.jpg");
        URL chiaki0URL = new URL("https://pbs.twimg.com/media/Cbjvg2KW8AAsF6w.jpg");
        URL chiaki1URL = new URL("http://p2.i.ntere.st/6bcbba054416b7b6c86599d3a09e82d4_480.jpg");
        BufferedImage chiaki0in = ImageIO.read(chiaki0URL);
        BufferedImage chiaki0 = new BufferedImage(496, 700, chiaki0in.getType());
        Graphics2D chiaki0Resize = chiaki0.createGraphics();
            chiaki0Resize.drawImage(chiaki0in, 0, 0, 496, 700, null);           //Disused afterwards
            chiaki0Resize.dispose();
        BufferedImage chiaki1in = ImageIO.read(chiaki0URL);
        BufferedImage chiaki1 = new BufferedImage(480, 312, chiaki1in.getType());
        JOptionPane lilyOptionPanel = new JOptionPane();
        Dimension chiakiIconSize = new Dimension(496, 700);                     //(new ImageIcon(chiaki0).getIconWidth(), new ImageIcon(chiaki0).getIconHeight());
        Object[] choices = { "Yes", "No", "Maybe"};
        
        
        
        JPanel lilyPanel0 = new JPanel(new BorderLayout());
        final JLabel lilyLabel0 = new JLabel(new ImageIcon(chiaki0)); 
        final JLabel lilyLabel1 = new JLabel(new ImageIcon(chiaki1));
        JButton lilyButton = new JButton("Next Image");
        lilyButton.setPreferredSize(new Dimension(30,15));
        lilyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                lily.remove(lilyLabel0);
                lily.add(lilyLabel1);
            }
        });
        
        
        lilyPanel0.setBorder(BorderFactory.createLineBorder(Color.red, 1, true));
        lily.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lily.setVisible(true);
        lily.setResizable(false);
        lily.setLocation(592, 175);                                             //1680 x 1050
        lily.setIconImage(chiakiIcon.getImage());
        lily.setMinimumSize(chiakiIconSize);
        lily.add(lilyPanel0);
        lily.add(lilyLabel0);
        lily.add(lilyButton);
        //lily.add(lilyButton);
    */
    
    public static void main(String[] args) throws IOException {
        windowsTesting lily = new windowsTesting();
    }
    
    public windowsTesting() throws MalformedURLException, IOException {
        super("Lily");
        setResizable(false);
        setLocation(592,175);
        setIconImage(chiakiIcon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setVisible(true);
        GridBagConstraints constraints = new GridBagConstraints();
        JLabel lilyLabel0 = new JLabel(chiaki); 
        lilyLabel0.setLayout(new GridBagLayout());
        JButton lilyButton0 = new JButton("Hello!");
            lilyButton0.setActionCommand("Greeting");
            lilyButton0.addActionListener(this);
            constraints.gridx = 0;
            constraints.gridy = 0;
            lilyLabel0.add(lilyButton0, constraints);
        JButton lilyButton1 = new JButton("Ohayo");
            lilyButton1.setActionCommand("Next Image");
            constraints.gridx = 1;
            constraints.gridy = 1;
            lilyButton1.addActionListener(this);
            lilyLabel0.add(lilyButton1, constraints);
        JMenuBar lilyBar = new JMenuBar();
            lilyBar.setLayout(new BorderLayout());
        JMenu lilyFile = new JMenu("File");
        JMenuItem lilyExit = new JMenuItem("Exit");
            lilyExit.addActionListener(this);
            lilyFile.add(lilyExit);
            lilyBar.add(lilyFile);
        
        setContentPane(lilyLabel0);
        setJMenuBar(lilyBar);
        pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String buttonAction = e.getActionCommand();
        switch(buttonAction){
            case "Greeting":
                JOptionPane.showMessageDialog(this, "Hi!", "Hi", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Next Image":
                this.nextImage();
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }
    public void nextImage(){
        JLabel lilyLabel1 = new JLabel(chiaki); 
        lilyLabel1.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JButton lilyButton0 = new JButton("Hello!");
            lilyButton0.setActionCommand("Greeting");
            lilyButton0.addActionListener(this);
            constraints.gridx = 0;
            constraints.gridy = 0;
            lilyLabel1.add(lilyButton0, constraints);
        JButton lilyButton1 = new JButton("Ohayo");
            lilyButton1.setActionCommand("Greeting1");
            constraints.gridx = 1;
            constraints.gridy = 1;
            lilyButton1.addActionListener(this);
            lilyLabel1.add(lilyButton1, constraints);
        setContentPane(lilyLabel1);
        pack();
    }
}
