package javautils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaActionListener {
    public static void main(String[] args) {

        JButton jb = new JButton();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá, Mundo!");
            }
        });
        jb.addActionListener(e -> System.out.println("Olá, Mundo!!"));
    }
}