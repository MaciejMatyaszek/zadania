/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Maciej
 */
public class Main extends JFrame {
    
    public Main(){
        initComponents();
        
    }
    public void initComponents(){
        this.setTitle("Moja formatka");
        this.setBounds(300, 300, 800, 800);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final DefaultListModel model = new DefaultListModel();
        JList lista = new JList(model);
        lista.setVisibleRowCount(4);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        this.getContentPane().add(lista);
        Container kontener = this.getContentPane();
       przycisk1 = new JButton ("Dodaj");
       przycisk2 = new JButton ("Usuń listę");
       przycisk3 = new JButton ("Przycisk 3");
       przycisk4 = new JButton ("Przycisk 4");
       kontener.add(przycisk1, BorderLayout.EAST);
       kontener.add(przycisk2, BorderLayout.BEFORE_LINE_BEGINS);
       kontener.add(przycisk3, BorderLayout.SOUTH);
       kontener.add(przycisk4, BorderLayout.AFTER_LINE_ENDS);
      jeden = new JTextField();
      kontener.add(jeden, BorderLayout.NORTH);
        
      przycisk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jeden.getText() != null)
                model.addElement(jeden.getText());
            }
        });
      przycisk2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeAllElements();
            }
        });
      przycisk3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = Integer.parseInt(jeden.getText());
                model.add(pos-1,jeden.getText());
            }
        });
      przycisk4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = Integer.parseInt(jeden.getText());
                model.add(pos-1,jeden.getText());
            }
        });
    }
    JButton przycisk1;
    JButton przycisk2;
    JButton przycisk3;
    JButton przycisk4;
    JTextField jeden;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main().setVisible(true);
    }
    
}
