package Unit02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
Author: Andy Zheng
Date Created: 1/3/17
*/
public class windowsTesting {
    public static void main(String[] args) throws MalformedURLException, IOException {
        ImageIcon chiakiIcon = new ImageIcon("M:\\Images\\ChiakiIcon.jpg");
        URL chiaki0URL = new URL("https://pbs.twimg.com/media/Cbjvg2KW8AAsF6w.jpg");
        BufferedImage chiaki0in = ImageIO.read(chiaki0URL);
        BufferedImage chiaki0 = new BufferedImage(496, 700, chiaki0in.getType());
        Graphics2D chiaki0Resize = chiaki0.createGraphics();
        chiaki0Resize.drawImage(chiaki0in, 0, 0, 496, 700, null);
        chiaki0Resize.dispose();
        JFrame lily = new JFrame("lily");
        JOptionPane lilyOptionPanel = new JOptionPane();
        JButton lilyButton = new JButton("Next Image") {
            {
            setSize(10, 5);
            setMaximumSize(getSize());
            }
        };
        Dimension chiakiIconSize = new Dimension(496, 700);                     //(new ImageIcon(chiaki0).getIconWidth(), new ImageIcon(chiaki0).getIconHeight());
        Object[] choices = { "Yes", "No", "Maybe"};
        JPanel lilyPanel0 = new JPanel(new BorderLayout());
        JLabel lilyLabel0 = new JLabel(new ImageIcon(chiaki0)); 
        
        
        lilyPanel0.setBorder(BorderFactory.createLineBorder(Color.red, 1, true));
        lily.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lily.setVisible(true);
        lily.setResizable(false);
        lily.setIconImage(chiakiIcon.getImage());
        lily.setMinimumSize(chiakiIconSize);
        lily.add(lilyPanel0);
        lily.add(lilyLabel0);
        //lily.add(lilyButton);
    }
}
