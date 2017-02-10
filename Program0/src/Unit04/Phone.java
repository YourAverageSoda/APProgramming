package Unit04;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author nolan caudill
 * @author Andy Zheng
 * Date Created: 1/31/17
 */
public class Phone implements ActionListener{
    JFrame keyScreen, screen;
    JButton[] keypadArray; 
    JPanel keypad, screenPanel;
    GridBagConstraints constraints;
    public static boolean status;
    JTextField textField;
    public static boolean time;
    public static JFrame startup;
    public static URL nokiaURL;
    public static ImageIcon nokia;
    public static JButton takeOverTheWorld;
    public static String model = "Nokia DiamondBreaker";
    
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
        String placeholder = getModel();
        if(placeholder.toUpperCase().matches("NOKIA DIAMONDBREAKER")){
            Phone phones = new Phone();
            phones.initializePhone();
        }
        else{
            Phone phones = new Phone(placeholder);
            phones.initializePhone();
        }
        boolean called = false;            
        Integer timeUntilCall = new Integer((int)(Math.random() * (Math.random()*10000)));
        while(!called){
            if((System.currentTimeMillis() >= timeUntilCall) ){
                JOptionPane.showConfirmDialog(null, "Incoming call from 763-506-8400");
                called = true;
            }
            else if(Phone.time){
                timeUntilCall += 1;
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public Phone() throws MalformedURLException{
        nokiaURL = new URL("http://icons.iconarchive.com/icons/igh0zt/ios7-style-metro-ui/512/MetroUI-Apps-Nokia-Suite-icon.png");
        nokia = new ImageIcon(nokiaURL);
        keypadArray = new JButton[19];
        keypad = new JPanel(new GridBagLayout());
        keypad.setPreferredSize(new Dimension(200,350));
        constraints = new GridBagConstraints();
        status = false;
        createDefaults();
    }
    public Phone(String modelType) throws MalformedURLException{
        model = modelType;
        nokiaURL = new URL("http://icons.iconarchive.com/icons/igh0zt/ios7-style-metro-ui/512/MetroUI-Apps-Nokia-Suite-icon.png");
        nokia = new ImageIcon(nokiaURL);
        keypadArray = new JButton[19];
        keypad = new JPanel(new GridBagLayout());
        keypad.setPreferredSize(new Dimension(200,350));
        constraints = new GridBagConstraints();
        status = false;
        createDefaults();
    }
    public void createDefaults(){
        keypadArray[14] = new JButton("Home");
        keypadArray[14].addActionListener(this);
        keypadArray[14].setActionCommand("HOME");
        takeOverTheWorld = new JButton("Take Over the World!");
        takeOverTheWorld.addActionListener(this);
        takeOverTheWorld.setActionCommand("TAKEOVER");
    }
    public static String getModel(){
        return JOptionPane.showInputDialog(null, "Input model: ", "Nokia DiamondBreaker");
    }
    public static String getModelType(){
        return model;
    }
    public void changeTextField(ActionEvent ae){
        textField.setText(textField.getText() + ae.getActionCommand());
    }
    public void initializePhone(){
        startup = new JFrame(model);
        startup.setResizable(false);
        startup.setMinimumSize(new Dimension(300, 70));
        startup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startup.setLocationRelativeTo(null);
        startup.add(takeOverTheWorld);
        startup.setVisible(true);
    }
    public void createHomeJFrame(){
        screen = new JFrame(model);
        screen.setResizable(false);
        screen.setSize(new Dimension(200, 350));
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setIconImage(nokia.getImage());
        createHomeScreen();
    }
    public void createHomeScreen(){
        screenPanel = new JPanel(new GridBagLayout());
        keypadArray[15] = new JButton("Phone");
        keypadArray[15].addActionListener(this);
        keypadArray[15].setActionCommand("PHONE");
        keypadArray[16] = new JButton("Stop Time");
        keypadArray[16].addActionListener(this);
        keypadArray[16].setActionCommand("TIME STOP");
        time = false;
        keypadArray[17] = new JButton("Reddit");
        keypadArray[17].addActionListener(this);
        keypadArray[17].setActionCommand("REDDIT");
        keypadArray[18] = new JButton("Shut Down");
        keypadArray[18].addActionListener(this);
        keypadArray[18].setActionCommand("SHUT DOWN");
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        screenPanel.add(keypadArray[15], constraints);
        constraints.gridx = 1;
        screenPanel.add(keypadArray[16], constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        screenPanel.add(keypadArray[17], constraints);
        constraints.gridx = 1;
        screenPanel.add(keypadArray[18], constraints);
        screen.add(screenPanel);
    }
    public void createKeypadJFrame(){
        keyScreen = new JFrame(model);
        keyScreen.setResizable(false);
        keyScreen.setSize(new Dimension(200, 350));
        keyScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyScreen.setLocationRelativeTo(null);
        keyScreen.setIconImage(nokia.getImage());
        this.createKeypad();
    }
    public void createKeypad(){
        textField = new JTextField();
        textField.setColumns(20);
        textField.setBounds(35, 60, 125, 20);
        keyScreen.add(textField);
        for(int i = 0; i < 10; i++){
            keypadArray[i] = new JButton(String.valueOf(i));
            keypadArray[i].addActionListener(this);
            keypadArray[i].setActionCommand(String.valueOf(i));
        }
        int counter = 1;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                constraints.gridx = j;
                constraints.gridy = i;
                keypad.add(keypadArray[counter++], constraints);
            }
        }
        constraints.gridy = 4;
        keypadArray[11] = new JButton("#");
        keypadArray[11].addActionListener(this);
        keypadArray[11].setActionCommand("#");
        constraints.gridx = 1;
        keypad.add(keypadArray[11], constraints);
        constraints.gridx = 2;
        keypad.add(keypadArray[0], constraints);
        keypadArray[12] = new JButton("*");
        keypadArray[12].addActionListener(this);
        keypadArray[12].setActionCommand("*");
        constraints.gridx = 3;
        keypad.add(keypadArray[12], constraints);
        keyScreen.add(keypad);
        keypadArray[13] = new JButton("Call");
        keypadArray[13].addActionListener(this);
        keypadArray[13].setActionCommand("CALL");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = 3;
        constraints.gridy = 5;
        constraints.gridx = 1;
        keypad.add(keypadArray[13], constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = 3;
        constraints.gridy = GridBagConstraints.SOUTH;
        constraints.gridx = 1;
        keypad.add(keypadArray[14], constraints);
        keyScreen.add(keypad);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case "#":
            case "*":
                changeTextField(ae);
                break;
            case "CALL":
                JOptionPane.showMessageDialog(keyScreen, "Calling " + textField.getText() + ".....", model, JOptionPane.INFORMATION_MESSAGE);
                break;
            case "TIME STOP":
                time = !time;    
                break;
            case "REDDIT":
                if (!time) {
                    JOptionPane.showMessageDialog(null, "I'm sorry, but Reddit isn't functional on a goddamn " + getModelType() + ".", getModelType(), JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "HOME":
                if (!time) {
                    textField.setText("");
                    screen.setLocationRelativeTo(keyScreen);
                    keyScreen.setVisible(false);
                    screen.setVisible(true);
                } 
                break;
            case "PHONE":
                if (!time) {
                    keyScreen.setLocationRelativeTo(screen);
                    screen.setVisible(false);
                    keyScreen.setVisible(true);
                }
                break;
            case "SHUT DOWN":
                if (!time) {
                    System.exit(0);
                }
                break;
            case "TAKEOVER":
                status = !status;
                startup.dispose();
                createHomeJFrame();
                createKeypadJFrame();
                screen.setVisible(true);
                break;
        }
    }
}
