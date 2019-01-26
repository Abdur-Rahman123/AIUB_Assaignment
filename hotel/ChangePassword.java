import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;

public class ChangePassword extends JFrame implements MouseListener, ActionListener
{
	private JLabel titleLabel, userLabel, oldPassLabel, newPassLabel,userIdLabel;
	private JTextField userIdTF;
	private JPasswordField oldPassPF, newPassPF;
	private JButton confirmBtn, backBtn, logoutBtn, exitBtn;
	private JPanel panel;
	
	String userId;
	
	public ChangePassword(String userId)
	{
		super("Change Password");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.userId = userId;
		
		Color myColor = new Color(160, 240, 170);
		Font myFont = new Font("Cambria",Font.BOLD, 20);
		
		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.CYAN);
		
		titleLabel = new JLabel("Change Password");
		titleLabel.setBounds(325, 50, 200, 30);
		titleLabel.setFont(myFont);
		titleLabel.setForeground(Color.BLUE);
		//titleLabel.setOpaque(true);
		panel.add(titleLabel);
		
		userIdLabel = new JLabel("UserID: ");
		userIdLabel.setBounds(300, 100, 100, 30);
		panel.add(userIdLabel);
		
		userIdTF = new JTextField();
		userIdTF.setBounds(400, 100, 150, 30);
		userIdTF.setBackground(myColor);
		panel.add(userIdTF);
		
		oldPassLabel = new JLabel("Old Password : ");
		oldPassLabel.setBounds(300,150, 100, 30);
		panel.add(oldPassLabel);
		
		oldPassPF = new JPasswordField();
		oldPassPF.setBounds(400, 150, 150, 30);
		oldPassPF.setBackground(myColor);
		panel.add(oldPassPF);
		
		newPassLabel = new JLabel("New Password : ");
		newPassLabel.setBounds(300,200, 100, 30);
		panel.add(newPassLabel);
		
		newPassPF = new JPasswordField();
		newPassPF.setBounds(400, 200, 150, 30);
		newPassPF.setBackground(myColor);
		panel.add(newPassPF);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(240, 250, 100, 30);
		backBtn.setBackground(Color.GRAY);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		confirmBtn = new JButton("Confirm");
		confirmBtn.setBounds(350, 250, 100, 30);
		confirmBtn.setBackground(Color.GREEN);
		confirmBtn.addMouseListener(this);
		confirmBtn.addActionListener(this);
		panel.add(confirmBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(460, 250, 100, 30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(650, 20, 100, 30);
		logoutBtn.setBackground(Color.YELLOW);
		logoutBtn.addMouseListener(this);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		this.add(panel);
	}
	
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()== backBtn)
		{
			backBtn.setBackground(Color.BLUE);
			backBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()== confirmBtn)
		{
			confirmBtn.setBackground(Color.BLUE);
			confirmBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()== exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()== logoutBtn)
		{
			logoutBtn.setBackground(Color.BLUE);
			logoutBtn.setForeground(Color.WHITE);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()== backBtn)
		{
			backBtn.setBackground(Color.GRAY);
			backBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()== confirmBtn)
		{
			confirmBtn.setBackground(Color.GREEN);
			confirmBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()== exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()== logoutBtn)
		{
			logoutBtn.setBackground(Color.YELLOW);
			logoutBtn.setForeground(Color.BLACK);
		}
		else{}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		
		if(text.equals(confirmBtn.getText()))
		{
			//checkLogin();
			updateInDB();
		}
		else if(text.equals(backBtn.getText()))
		{
			
		}
		else if(text.equals(logoutBtn.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}
		else if(text.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		else{}
	}
	
	public void updateInDB()
	{
		String newId = userIdTF.getText();
		String newPass = newPassPF.getText();
		
		String query = "UPDATE `login` SET `password`='"+newPass+"' WHERE `userId`='"+newId+"'";		
        Connection con=null;
        Statement st = null;
		ResultSet rs=null;
		System.out.println(query);
        try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			st = con.createStatement();
			st.executeUpdate(query);
			st.close();
			con.close();
		}
			catch(Exception e)
		{
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(this, "Oops !!!");
		}
			
	}
	
	
	public void checkLogin()
	{
		String query = "SELECT `userId`, `password`, `status` FROM `login`;";     
        Connection con=null;
        Statement st = null;
		ResultSet rs = null;
		System.out.println(query);
        
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
			System.out.println("connection done");
			st = con.createStatement();
			System.out.println("statement created");
			rs = st.executeQuery(query);
			System.out.println("results received");
			
			boolean flag = false;			
			while(rs.next())
			{
                String userId = rs.getString("userId");
				String password = rs.getString("password");
				int status = rs.getInt("status");
				
				if(userId.equals(userIdTF.getText()) && password.equals(oldPassPF.getText()))
				{
					flag=true;
					if(status==0)
					{
					    ManagerHome mh = new ManagerHome(userId);
						mh.setVisible(true);
						this.setVisible(false);
						
					}
					else if(status==1)
					{
						EmployeeHome eh = new EmployeeHome(userId);
						eh.setVisible(true);
						this.setVisible(false);
						
					}
					else if(status==2)
					{
						CustomerHome ch = new CustomerHome(userId);
						ch.setVisible(true);
						this.setVisible(false);
						
					}
					else{}
				}
			}
			if(!flag)
			{
				JOptionPane.showMessageDialog(this,"Invalid ID or Password"); 
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
	}
}