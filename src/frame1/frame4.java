/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gaurav
 */
public class frame4 extends Thread implements ActionListener{
    
     
     StringBuilder s2=new StringBuilder();
JLabel jl1,jl2,jl3;
   JFrame jf1;
   JPanel jp1,jp2,jp3,jp4,jp5,jp6;
  
   JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
   String[] s1={"italy","india","america","france"};
           Random r1=new Random();
                   int l2=r1.nextInt(4);
                   String s5=s1[l2];
        int l1=s1[l2].length();
int c1=0;



ImageIcon im;





    public frame4(){
        
        
        im=new ImageIcon("C:\\Users\\gaurav\\Desktop\\image4.jpg");
 
  Image img=im.getImage();
  Image tim=img.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
  im=new ImageIcon(tim);
    jl3=new JLabel("",im,JLabel.CENTER);
    
       
        
        
        
        
        a=new JButton("A");
        b=new JButton("B");
                c=new JButton("C");

        d=new JButton("D");
        e=new JButton("E");
        f=new JButton("F");
        g=new JButton("G");
        h=new JButton("H");
        i=new JButton("I");
        j=new JButton("J");
         k=new JButton("K");
          l=new JButton("L");
           m=new JButton("M");
            n=new JButton("N");
             o=new JButton("O");
              p=new JButton("P");
               q=new JButton("Q");
                r=new JButton("R");
                 s=new JButton("S");
                  t=new JButton("T");
                   u=new JButton("U");
                    v=new JButton("V");
                     w=new JButton("W");
                      x=new JButton("X");
                       y=new JButton("Y");
                        z=new JButton("Z");
     a.setPreferredSize(new Dimension(67,50));
      b.setPreferredSize(new Dimension(67,50));
       c.setPreferredSize(new Dimension(67,50));
        d.setPreferredSize(new Dimension(67,50));
         e.setPreferredSize(new Dimension(67,50));
          f.setPreferredSize(new Dimension(67,50));
           g.setPreferredSize(new Dimension(67,50));
            h.setPreferredSize(new Dimension(67,50));
             i.setPreferredSize(new Dimension(67,50));
              j.setPreferredSize(new Dimension(67,50));
               k.setPreferredSize(new Dimension(67,50));
                l.setPreferredSize(new Dimension(67,50));
                 m.setPreferredSize(new Dimension(67,50));
                  n.setPreferredSize(new Dimension(67,50));
                  o.setPreferredSize(new Dimension(67,50));
                  p.setPreferredSize(new Dimension(67,50));
                   q.setPreferredSize(new Dimension(67,50));
                    r.setPreferredSize(new Dimension(67,50));
                     s.setPreferredSize(new Dimension(67,50));
                      t.setPreferredSize(new Dimension(67,50));
                       u.setPreferredSize(new Dimension(67,50));
                        v.setPreferredSize(new Dimension(67,50));
                         w.setPreferredSize(new Dimension(67,50));
                                                  x.setPreferredSize(new Dimension(67,50));

                                                y.setPreferredSize(new Dimension(67,50));
                       
                        z.setPreferredSize(new Dimension(67,50));  
                        Font f1=new Font("Serif",Font.BOLD,35);
                        a.setBackground(Color.BLACK);  
                        a.setForeground(Color.BLACK);                        
                        a.setOpaque(false);
                        a.setFont(f1);
                        
 
b.setBackground(Color.BLACK);  
                        b.setForeground(Color.BLACK);                        
                        b.setOpaque(false);
                        b.setFont(f1);
c.setBackground(Color.BLACK);  
                        c.setForeground(Color.BLACK);                        
                        c.setOpaque(false);
                        c.setFont(f1);
d.setBackground(Color.BLACK);  
                        d.setForeground(Color.BLACK);                        
                        d.setOpaque(false);
                        d.setFont(f1);
e.setBackground(Color.BLACK);  
                        e.setForeground(Color.BLACK);                        
                        e.setOpaque(false);
                        e.setFont(f1);
f.setBackground(Color.BLACK);  
                        f.setForeground(Color.BLACK);                        
                        f.setOpaque(false);
                        f.setFont(f1);
g.setBackground(Color.BLACK);  
                        g.setForeground(Color.BLACK);                        
                        g.setOpaque(false);
                        g.setFont(f1);
                        h.setBackground(Color.BLACK);  
                        h.setForeground(Color.BLACK);                        
                        h.setOpaque(false);
                        h.setFont(f1);
                    
i.setBackground(Color.BLACK);  
                        i.setForeground(Color.BLACK);                        
                        i.setOpaque(false);
                        i.setFont(f1);
                        j.setBackground(Color.BLACK);  
                        j.setForeground(Color.BLACK);                        
                        j.setOpaque(false);
                        j.setFont(f1);
                    
k.setBackground(Color.BLACK);  
                        k.setForeground(Color.BLACK);                        
                        k.setOpaque(false);
                        k.setFont(f1);
l.setBackground(Color.BLACK);  
                        l.setForeground(Color.BLACK);                        
                        l.setOpaque(false);
                        l.setFont(f1);
m.setBackground(Color.BLACK);  
                        m.setForeground(Color.BLACK);                        
                        m.setOpaque(false);
                        m.setFont(new Font("Serif",Font.BOLD,33));
n.setBackground(Color.BLACK);  
                        n.setForeground(Color.BLACK);                        
                        n.setOpaque(false);
                        n.setFont(f1);
o.setBackground(Color.BLACK);  
                        o.setForeground(Color.BLACK);                        
                        o.setOpaque(false);
                        o.setFont(f1);
p.setBackground(Color.BLACK);  
                        p.setForeground(Color.BLACK);                        
                        p.setOpaque(false);
                        p.setFont(f1);
q.setBackground(Color.BLACK);  
                        q.setForeground(Color.BLACK);                        
                        q.setOpaque(false);
                        q.setFont(f1);
r.setBackground(Color.BLACK);  
                        r.setForeground(Color.BLACK);                        
                        r.setOpaque(false);
                        r.setFont(f1);
s.setBackground(Color.BLACK);  
                        s.setForeground(Color.BLACK);                        
                        s.setOpaque(false);
                        s.setFont(f1);
t.setBackground(Color.BLACK);  
                        t.setForeground(Color.BLACK);                        
                        t.setOpaque(false);
                        t.setFont(f1);
u.setBackground(Color.BLACK);  
                        u.setForeground(Color.BLACK);                        
                        u.setOpaque(false);
                        u.setFont(f1);
v.setBackground(Color.BLACK);  
                        v.setForeground(Color.BLACK);                        
                        v.setOpaque(false);
                        v.setFont(f1);
w.setBackground(Color.BLACK);  
                        w.setForeground(Color.BLACK);                        
                        w.setOpaque(false);
                        w.setFont(new Font("Serif",Font.BOLD,33));
x.setBackground(Color.BLACK);  
                        x.setForeground(Color.BLACK);                        
                        x.setOpaque(false);
                        x.setFont(f1);
y.setBackground(Color.BLACK);  
                        y.setForeground(Color.BLACK);                        
                        y.setOpaque(false);
                        y.setFont(f1);
z.setBackground(Color.BLACK);  
                        z.setForeground(Color.BLACK);                        
                        z.setOpaque(false);
                        z.setFont(f1);
                    
                  
                  
        a.addActionListener(this);
         b.addActionListener(this);
          c.addActionListener(this);
           d.addActionListener(this);
            e.addActionListener(this);
             f.addActionListener(this);
              g.addActionListener(this);
               h.addActionListener(this);
                i.addActionListener(this);
                 j.addActionListener(this);
                  k.addActionListener(this);
                   l.addActionListener(this);
                    m.addActionListener(this);
                     n.addActionListener(this);
                      o.addActionListener(this);
                       p.addActionListener(this);
                        q.addActionListener(this);
                         r.addActionListener(this);
                          s.addActionListener(this);
                           t.addActionListener(this);
                            u.addActionListener(this);
                            v.addActionListener(this);
                              w.addActionListener(this);
                               x.addActionListener(this);
                                y.addActionListener(this);
                                 z.addActionListener(this);
                          
                                
                              
                        
                        
                      
              
        
   jf1= new JFrame();
   jp1=new JPanel();
    jp3=new JPanel();
    jp4=new JPanel();
    jp5=new JPanel();
   jp2=new JPanel();
      jp6=new JPanel();
      
      
    jp1.setOpaque(false);
      jp2.setOpaque(false);
      jp3.setOpaque(false);
      jp4.setOpaque(false);
      jp5.setOpaque(false);
      jp6.setOpaque(false);
      
      
jl2=new JLabel();
     jl2.setForeground(Color.BLACK);
  
   jf1.setLayout(new FlowLayout());
    GridBagConstraints c1=new GridBagConstraints();  
   
   jf1.setVisible(true);
   jf1.setSize(800,500);
   
  
   jp1.setLayout(new GridBagLayout());
//  jp1.setPreferredSize(new Dimension(782,100));
   //jp2.setPreferredSize(new Dimension(100,100));
//jp1.setSize(100,100);
   
   jp2.add(a);
   jp2.add(b);
   jp2.add(c);
   jp2.add(d);
   jp2.add(e);
   jp2.add(f);
   jp2.add(g);
   jp2.add(h);
   jp2.add(i);
   jp2.add(j);
   jp3.add(k);
   jp3.add(l);
   jp3.add(m);
   jp3.add(n);
   jp3.add(o);
   jp3.add(p);
     jp3.add(q);
       jp3.add(r);
   jp3.add(s);
   jp4.add(t);
   jp4.add(u);
   jp4.add(v);
   jp4.add(w);
   jp4.add(x);
   jp4.add(y);
   jp4.add(z);
   c1.gridx=0;
   c1.gridy=1;
  jp1.add(jp2,c1);
  c1.gridx=0;
   c1.gridy=2;
  jp1.add(jp3,c1);
  c1.gridx=0;
   c1.gridy=3;
  jp1.add(jp4,c1);
  jp6.setBounds(0,0,800,100);
  jl3.add(jp6);
  jl2.setFont(new Font("Serif",Font.BOLD,60));
  jl2.setText("Time Starts Now");
  jp6.add(jl2);
   jp1.setBounds(25,250,750,190);
           jp1.setBackground(Color.BLACK);

   jl3.add(jp1);
     
      
       for(int i=0;i<l1;i++){
           s2.append("-  ");
       }
        
        jl1=new JLabel(s2.toString());
        jl1.setFont(new Font("Serif",Font.BOLD,60));
        jl1.setForeground(Color.BLACK);
       
        jp5.add(jl1,c1);
        jp5.setBounds(0,150,800,100);
        jp5.setBackground(Color.BLACK);
        jl3.add(jp5);
        
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf1.add(jl3);
    jf1.validate();
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
     public void actionPerformed(ActionEvent e){
        int f=0;
        String s3=e.getActionCommand();
        String s6=s3.toLowerCase();
        JButton jb=(JButton) e.getSource();
        
      for(int i=0;i<l1;i++){
          if(s6.charAt(0)==s5.charAt(i)){
              s2.replace(i*3, i*3+1, s3);
             f=1;
             c1++;
              
          }
      }
     
      if(f==1){
      jl1.setText(s2.toString());
      jb.setEnabled(false);
        
    }
      else{
          jb.setEnabled(false);
      }
      
      if(c1==l1){
          jf1.dispose();
          String s1="YOU WON";
       frame5 o=new frame5();
       o.method1(s1);    
      }
    }
    
    public void run(){
       int y1=0;
         try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
         }
        for(int i=20;i>=0;i--){
            String s1=Integer.toString(i);
            jl2.setFont(new Font("Serif",Font.BOLD,60));
            jl2.setText(":"+s1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        y1=1;
       if(y1==1 && c1!=l1){
          jf1.dispose();
       String s1="YOU LOST";
       frame5 o=new frame5();
       o.method1(s1);
      }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
        frame4 obj=new frame4();
        obj.start();
    }
    
    
}