package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JLabel text,pintext,repintext;
    JTextField pin,repin;
    JButton change,back;

    PinChange(String pinchange){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text=new JLabel("Change Your Pin");
        text.setBounds(250,280,500,20);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        image.add(text);

        pintext=new JLabel("New Pin:");
        pintext.setBounds(165,320,180,25);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setForeground(Color.WHITE);
        image.add(pintext);

        pin=new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,30);
        image.add(pin);

        repintext=new JLabel("Re-Enter New Pin:");
        repintext.setBounds(165,360,180,25);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setForeground(Color.WHITE);
        image.add(repintext);

        repin=new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,30);
        image.add(repin);

        change=new JButton("CHANGE");
        change.setBounds(355,450,150,30);
        change.addActionListener(this);
        image.add(change);

        back=new JButton("BACK");
        back.setBounds(355,485,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
