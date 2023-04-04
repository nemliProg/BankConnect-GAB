package com.nexbank.nexonlinebanking;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ScaleImage {

    public void scaleImage(String name, JLabel l) {
        ImageIcon icon = new ImageIcon(getClass().getResource(name));
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        l.setIcon(scaledIcon);
    }

    public void scaleImage(String name, JButton b) {
        ImageIcon icon = new ImageIcon(getClass().getResource(name));
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        b.setIcon(scaledIcon);
    }

    public void scaleImage(String name, JToggleButton b) {
        ImageIcon icon = new ImageIcon(getClass().getResource(name));
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        b.setIcon(scaledIcon);
    }
}
