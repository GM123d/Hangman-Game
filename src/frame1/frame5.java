
package frame1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frame5 extends Thread implements ActionListener{
    
 JFrame jf1;
    JLabel jl1,jl2;
    JPanel jp1,jp2;
    JButton jb1,jb2;
    ImageIcon im;
    public frame5(){
        
        im=new ImageIcon("C:\\Users\\gaurav\\Desktop\\image4.jpg");
 
  Image img=im.getImage();
  Image tim=img.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
  im=new ImageIcon(tim);
    jl2=new JLabel("",im,JLabel.CENTER);
        
        
         jf1=new JFrame();
       jf1.setLayout(new FlowLayout());
       jl1=new JLabel();
       jp1=new JPanel();
       jp2=new JPanel();
      
       jb1=new JButton("PLAY GAIN"){
           
         public void paintComponent(Graphics g){
             g.setColor(getBackground());
             g.fillRect(0,0,getWidth(),getHeight());
             super.paintComponent(g);
           
             
         }
       };
       jb2=new JButton("EXIT"){
           
         public void paintComponent(Graphics g){
             g.setColor(getBackground());
             g.fillRect(0,0,getWidth(),getHeight());
             super.paintComponent(g);
           
             
         }
       };
       jb1.setOpaque(false);
       jb2.setOpaque(false);
        jb1.setBackground(new Color(0,0,0,50));
        jb2.setBackground(new Color(0,0,0,50));
        jb1.setFont(new Font("Serif",Font.BOLD,30));
        jb2.setFont(new Font("Serif",Font.BOLD,30));
       jb1.setPreferredSize(new Dimension(400,50));
       jb2.setPreferredSize(new Dimension(400,50));
       jp1.setOpaque(false);
       jp1.setBackground(Color.GREEN);
       jp2.setOpaque(false);
              jp2.setBackground(Color.BLACK);
              GridBagConstraints c=new GridBagConstraints();
              c.insets=new Insets(5,5,5,5);
              jp2.setLayout(new GridBagLayout());
              c.gridx=0;
              c.gridy=1;
jp2.add(jb1,c);
c.gridx=0;
              c.gridy=2;
jp2.add(jb2,c);
       jf1.setVisible(true);
       jf1.setSize(800,500);
       jp1.add(jl1);
       jp1.setBounds(50,50,700,100);
       jp2.setBounds(50,150,700,200);
       jl2.add(jp2);
       jl2.add(jp1);
       jf1.add(jl2);
       jb1.addActionListener(this);
       jb2.addActionListener(this);
        
    }
    
    
    
    public static void main(String[] args){
        
        
        frame5 obj=new frame5();
        
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
       
          if(e.getSource()==jb1){
            jf1.dispose();
            frame3 ob=new frame3();
            ob.start();
        }
        else if(e.getSource()==jb2){
            jf1.dispose();
        }
        
    }
        
        
     public void method1(String s1){
       
       StringBuffer s2=new StringBuffer();
       for(int i=0;i<s1.length();i++){
           char s=s1.charAt(i);
           s2.append(s);
           jl1.setFont(new Font("Serif",Font.BOLD,60));
           jl1.setText(s2.toString());
           try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(animation.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       
   }
        
    }
    
    
    

