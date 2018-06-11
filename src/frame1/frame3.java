
package frame1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class frame3 extends Thread implements ActionListener {

JFrame jf1;
JLabel jl1,jl2;
ImageIcon im;
JButton b1,b2,b3;
JPanel jp1,jp2;
public frame3(){
   
    jf1=new JFrame();
//     jf1.setUndecorated(true);
      jf1.setVisible(true);
    jf1.setLayout(new FlowLayout());
    jf1.setSize(800,500);
   jf1.setResizable(false);
   
    
    jl2=new JLabel("HANGMAN GAME");
    jl2.setForeground(Color.BLACK);
    jl2.setBounds(120,0,560,100);
    jl2.setFont(new Font("Serif",Font.BOLD,60));
     b1=new JButton("PLAY"){
         public void paintComponent(Graphics g){
             g.setColor(getBackground());
             g.fillRect(0,0,getWidth(),getHeight());
             super.paintComponent(g);
           
             
         }
     };
     b2=new JButton("OPTION"){
         public void paintComponent(Graphics g){
             g.setColor(getBackground());
             g.fillRect(0,0,getWidth(),getHeight());
             super.paintComponent(g);
           
             
         }
     };
     b3=new JButton("EXIT"){
         public void paintComponent(Graphics g){
             g.setColor(getBackground());
             g.fillRect(0,0,getWidth(),getHeight());
             super.paintComponent(g);
           
             
         }
     };
      
    
     b1.setPreferredSize(new Dimension(300,50));
      b2.setPreferredSize(new Dimension(300,50));
       b3.setPreferredSize(new Dimension(300,50));
     b1.setFont(new Font("Serif",Font.BOLD,30));
     b2.setFont(new Font("Serif",Font.BOLD,30));
     b3.setFont(new Font("Serif",Font.BOLD,30));
     
     
   
  im=new ImageIcon("C:\\Users\\gaurav\\Desktop\\image4.jpg");
 
  Image img=im.getImage();
  Image tim=img.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
  im=new ImageIcon(tim);
    jl1=new JLabel("",im,JLabel.CENTER);

  jp2=new JPanel();
  jp2.setBounds(200,150,400,300);
  jp2.setLayout(new GridBagLayout());
 GridBagConstraints c=new GridBagConstraints();
 c.insets=new Insets(10,10,10,10);
 c.gridx=0;
 c.gridy=0;
  b1.setBackground(new Color(0,0,0,50));
  b1.setForeground(Color.BLACK);
  b1.setOpaque(false);
  jp2.add(b1,c);
  
   c.gridx=0;
 c.gridy=1;
   b2.setBackground(new Color(0,0,0,50));
  b2.setForeground(Color.BLACK);
  b2.setOpaque(false);
   jp2.add(b2,c);
   c.gridx=0;
 c.gridy=2;
  
 b3.setBackground(new Color(0,0,0,50));
  b3.setForeground(Color.BLACK);
  b3.setOpaque(false);
   jp2.add(b3,c);
  
  
     
  jp1=new JPanel(); 
    jp1.setBounds(0,0,800,100);
   
    jp1.setLayout(new FlowLayout());
    jp1.setOpaque(false);
        jp2.setOpaque(false);

    jl1.add(jl2);
    jl1.add(jp1);
    jl1.add(jp2);
jf1.add(jl1);
b1.addActionListener(this);
b2.addActionListener(this);
jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);
 jf1.validate();
 
  
}





public void actionPerformed(ActionEvent e){
         if(e.getSource()==b1){
             jf1.dispose();
             frame4 f=new frame4();
             f.start();
         }
         if(e.getSource()==b2){
             jf1.dispose();
             frame2 f11=new frame2();
         }
         else{
             jf1.dispose();
         }
    }



  public void run(){
       
       
      
        for(int i=-50;i<=0;i++){
           
                        jl2.setBounds(120,i,560,100);
         
     
               
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }





public static void main(String[] args){
    frame3 obf=new frame3();
    obf.start();
}
    
}
