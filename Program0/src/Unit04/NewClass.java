package Unit04;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author andy_zheng422
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        NewClass hello = new NewClass();
    }
    public NewClass() throws IOException{
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            //URL url = getClass().getResource("Nokia.png");
            InputStream is = NewClass.class.getResourceAsStream("Nokia.png");
            BufferedImage bfImage = ImageIO.read(is);
            Image isImage = bfImage.getScaledInstance(300, 300, 300);
            //ImageIcon image = new ImageIcon(url); 
            label.setIcon(new ImageIcon(isImage));
            panel.add(label);
            frame.add(panel);
            frame.setMinimumSize(new Dimension(111,111));
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

