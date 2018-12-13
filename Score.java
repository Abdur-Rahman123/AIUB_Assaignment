import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*; 
public class Score extends JFrame implements Runnable,ActionListener
{
	JPanel panel;
	 JLabel label;
	 JButton b[]=new JButton[11];
	 JButton exit;
	 int score;
	 Random r;
	public Score()
	{
		super("Click Counter");
		this.setSize(500,600);
		Color myColor = new Color(160, 240, 170);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setLayout(null);
		b[0]=new JButton("Button 1");
		b[0].setBounds(200,100,100,30);
		b[0].setBackground(Color.RED);
		b[0].addActionListener(this);
		panel.add(b[0]);
		b[1]=new JButton("Button 2");
		b[1].setBounds(300,100,100,30);
		b[1].setBackground(Color.RED);
		b[1].addActionListener(this);
		panel.add(b[1]);
		b[2]=new JButton("Button 3");
		b[2].setBounds(200,150,100,30);
		b[2].setBackground(Color.RED);
		b[2].addActionListener(this);
		panel.add(b[2]);
		b[3]=new JButton("Button 4");
		b[3].setBounds(300,150,100,30);
		b[3].setBackground(Color.RED);
		b[3].addActionListener(this);
		panel.add(b[3]);
		b[4]=new JButton("Button 5");
		b[4].setBounds(200,200,100,30);
		b[4].setBackground(Color.RED);
		b[4].addActionListener(this);
		panel.add(b[4]);
		b[5]=new JButton("Button 6");
		b[5].setBounds(300,200,100,30);
		b[5].setBackground(Color.RED);
		b[5].addActionListener(this);
		panel.add(b[5]);
		b[6]=new JButton("Button 7");
		b[6].setBounds(200,250,100,30);
		b[6].setBackground(Color.RED);
		b[6].addActionListener(this);
		panel.add(b[6]);
		b[7]=new JButton("Button 8");
		b[7].setBounds(300,250,100,30);
		b[7].setBackground(Color.RED);
		b[7].addActionListener(this);
		panel.add(b[7]);
		b[8]=new JButton("Button 9");
		b[8].setBounds(200,300,100,30);
		b[8].setBackground(Color.RED);
		b[8].addActionListener(this);
		panel.add(b[8]);
		b[9]=new JButton("Button 10");
		b[9].setBounds(300,300,100,30);
		b[9].setBackground(Color.RED);
		b[9].addActionListener(this);
		panel.add(b[9]);
		exit=new JButton("EXIT");
		exit.setBounds(100,400,300,100);
		exit.addActionListener(this);
		panel.add(exit);
		label=new JLabel("Score "+score);
		label.setBounds(100,50,120,30);
		panel.add(label);
		r=new Random();
		
		this.add(panel);
	}
	public void run()
	{
		int x=0;
		for(int i=0;i<100;i++)
		{
		try{
			Color myColor = new Color(160, 240, 170);
			System.out.println(i);
			x=r.nextInt(10);
			b[x].setBackground(Color.GREEN);
			Thread.sleep(1500);
			b[x].setBackground(Color.RED);
		
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		
		if(text.equals(b[0].getText()))
		{
			Color x=b[0].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[1].getText()))
		{
			Color x=b[1].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[2].getText()))
		{
			Color x=b[2].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[3].getText()))
		{
			Color x=b[3].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[4].getText()))
		{
			Color x=b[4].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[5].getText()))
		{
			Color x=b[5].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[6].getText()))
		{
			Color x=b[6].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[7].getText()))
		{
			Color x=b[7].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[8].getText()))
		{
			Color x=b[8].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			if(text.equals(b[9].getText()))
		{
			Color x=b[9].getBackground();
			
			if(x==Color.GREEN)
			{
				score=score+10;
				label=new JLabel("Score "+score);
		        label.setBounds(100,50,120,30);
				
			}
			else
			{
				score=score-10;
				label=new JLabel("Score "+score);
		         label.setBounds(100,50,120,30);
				
			}
		}
			
		 if(text.equals(exit.getText()))
		{
			System.exit(0);
		}
		
		}
		
	
	public static void main(String args[])
	{
		Score s=new Score();
		s.setVisible(true);
		s.run();
	}
}
