import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Exemplo_2 extends JFrame{

    JLabel rotulo1, rotulo2, rotulo3, rotulo4;

    ImageIcon imagem1 = new ImageIcon("C:/Users/Thainá/Documents/GitHub/ihc/IHC - Aula 02/src/TV1.gif");
    ImageIcon imagem2 = new ImageIcon("C:/Users/Thainá/Documents/GitHub/ihc/IHC - Aula 02/src/TV2.gif");

 Exemplo_2(boolean mudaIcone){
    setTitle("GUI com Rótulos e Imagens");
    setSize(300,300);
    if(!mudaIcone)
        setLocation(200,200);
    else
        setLocation(500,200);
    
    setResizable(false);
    getContentPane().setBackground(new Color(220,220,220));
    rotulo1 = new JLabel("Bem vindo à nossa segunda aplicação GUI",JLabel.CENTER);
    rotulo1.setForeground(Color.blue);
    rotulo1.setToolTipText("Esse rótulo não contém imagem!!!");
    rotulo2 = new JLabel(imagem1);
    rotulo3 = new JLabel("Veja a programação de hoje!");
    rotulo3.setHorizontalAlignment(SwingConstants.LEFT);
    if (mudaIcone)
        rotulo3.setIcon(rotulo2.getIcon());
    
    rotulo3.setForeground(Color.darkGray);
    if (mudaIcone)
        rotulo4 = new JLabel("Não deixe a sua TV assim!!!", rotulo2.getIcon(),JLabel.RIGHT);
    else
        rotulo4 = new JLabel("Não deixe a sua TV assim!!!", imagem2, JLabel.RIGHT);
    
    rotulo4.setFont(new Font("Courier",Font.BOLD,12));
    rotulo4.setForeground(Color.red);
    rotulo4.setVerticalAlignment(SwingConstants.TOP);
    setLayout(new GridLayout(4,1));
    add(rotulo1);
    add(rotulo2);
    add(rotulo3);
    add(rotulo4);
 } 
 
 public static void main(String args[]){
    
    JFrame GUI_1 = new Exemplo_2(false);
    JFrame GUI_2 = new Exemplo_2(true);
    GUI_1.setVisible(true);
    GUI_2.setVisible(true);
    GUI_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GUI_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 } 
} 