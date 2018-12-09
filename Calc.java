import javax.swing.*;
import java.awt.event.*;
 
 
class Calc implements ActionListener
{
    JFrame jf;
    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mul,sub,add,dec,eq,del,clr;
 
    static double a=0.00,b=0.00,result=0.00;
    static int operator=0;
 
   public Calc()
    {
        jf=new JFrame("Calculator");
        tf=new JTextField();
		tf.setBounds(20,30,300,30);
        b1=new JButton("1");
		b1.setBounds(30,230,50,40);
		b1.addActionListener(this);
        b2=new JButton("2");
		b2.setBounds(110,230,50,40);
		b2.addActionListener(this);
        b3=new JButton("3");
		 b3.setBounds(180,230,50,40);
		b3.addActionListener(this);
        b4=new JButton("4");
		 b4.setBounds(30,160,50,40);
		b4.addActionListener(this);
        b5=new JButton("5");
		b5.setBounds(100,160,50,40);
		b5.addActionListener(this);
        b6=new JButton("6");
		 b6.setBounds(170,160,50,40);
		b6.addActionListener(this);
        b7=new JButton("7");
		b7.addActionListener(this);
		b7.setBounds(40,100,50,40);
        b8=new JButton("8");
		b8.addActionListener(this);
		b8.setBounds(110,100,50,40);
        b9=new JButton("9");
		b9.addActionListener(this);
		b9.setBounds(180,100,50,40);
        b0=new JButton("0");
		 b0.setBounds(110,310,50,40);
		b0.addActionListener(this);
        div=new JButton("/");
		div.addActionListener(this);
		div.setBounds(250,100,50,40);
        mul=new JButton("*");
		mul.setBounds(250,160,50,40);
		mul.addActionListener(this);
        sub=new JButton("-");
		sub.addActionListener(this);
		sub.setBounds(250,230,50,40);
        add=new JButton("+");
		add.setBounds(250,310,50,40);
		add.addActionListener(this);
        dec=new JButton(".");
		dec.setBounds(40,310,50,40);
		dec.addActionListener(this);
        eq=new JButton("=");
		eq.setBounds(180,310,50,40);
		eq.addActionListener(this);
        del=new JButton("Delete");
		del.setBounds(60,380,100,40);
		del.addActionListener(this);
        clr=new JButton("Clear");
		clr.setBounds(180,380,100,40);
		clr.addActionListener(this);
		jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(350,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setResizable(false);
        
        jf.add(tf);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(div);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(mul);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(sub);
        jf.add(dec);
        jf.add(b0);
        jf.add(eq);
        jf.add(add);
        jf.add(del);
        jf.add(clr);
       
    }
 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            tf.setText(tf.getText().concat("1"));
        
        if(ae.getSource()==b2)
            tf.setText(tf.getText().concat("2"));
        
        if(ae.getSource()==b3)
            tf.setText(tf.getText().concat("3"));
        
        if(ae.getSource()==b4)
            tf.setText(tf.getText().concat("4"));
        
        if(ae.getSource()==b5)
            tf.setText(tf.getText().concat("5"));
        
        if(ae.getSource()==b6)
            tf.setText(tf.getText().concat("6"));
        
        if(ae.getSource()==b7)
            tf.setText(tf.getText().concat("7"));
        
        if(ae.getSource()==b8)
            tf.setText(tf.getText().concat("8"));
        
        if(ae.getSource()==b9)
            tf.setText(tf.getText().concat("9"));
        
        if(ae.getSource()==b0)
            tf.setText(tf.getText().concat("0"));
        
        if(ae.getSource()==dec)
            tf.setText(tf.getText().concat("."));
        
        if(ae.getSource()==add)
        {
            a=Double.parseDouble(tf.getText());
            operator=1;
            tf.setText("");
        } 
        
        if(ae.getSource()==sub)
        {
            a=Double.parseDouble(tf.getText());
            operator=2;
            tf.setText("");
        }
        
        if(ae.getSource()==mul)
        {
            a=Double.parseDouble(tf.getText());
            operator=3;
            tf.setText("");
        }
        
        if(ae.getSource()==div)
        {
            a=Double.parseDouble(tf.getText());
            operator=4;
            tf.setText("");
        }
        
        if(ae.getSource()==eq)
        {
            b=Double.parseDouble(tf.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            tf.setText(""+result);
        }
        
        if(ae.getSource()==clr)
            tf.setText("");
        
        if(ae.getSource()==del)
        {
            String s=tf.getText();
            tf.setText("");
            for(int i=0;i<s.length()-1;i++)
            tf.setText(tf.getText()+s.charAt(i));
        }        
    }
	public static void main(String args[])
    {
        Calc c=new Calc();
    }
}