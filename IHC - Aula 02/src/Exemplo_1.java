import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo_1 extends JFrame{
    public static void main (String args[]){
        //JOptionPane.showMessageDialog(null, "Olá mundo!!!");
        JFrame GUI = new Exemplo_1();
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
Exemplo_1(){ //Construtor
    //Construção da interface, desenha aqui
    setTitle("Primeiro exercício");
    setSize(300,300);
    setLocation(200,200);
    setResizable(false);
    getContentPane().setBackground(Color.gray);
    String titulo = getTitle();
 } 
}