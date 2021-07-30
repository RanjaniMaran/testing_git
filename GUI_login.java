import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_login implements ActionListener {

	private static JLabel user_label,password_label;
	private static JTextField userText;
	private static JPasswordField password;
	private static JButton login_button,register_button ;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel= new JPanel();
		 JFrame frame= new JFrame("User Login");
		 frame.setSize(350, 200);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 frame.add(panel);
		 
		 panel.setLayout(null);
		 
		 user_label = new JLabel("Username");
		 user_label.setBounds(10,20,80,25);
		 panel.add(user_label);
		 
		 userText= new JTextField(20);
		 userText.setBounds(100,20,165,25);
		 panel.add(userText);
		 
		 password_label = new JLabel("Password");
		 password_label.setBounds(10,50,80,25);
		 panel.add(password_label);
		 
		 password= new JPasswordField(20);
		 password.setBounds(100,50,165,25);
		 panel.add(password);
		 
		 login_button= new JButton("LOGIN");
		 login_button.setBounds(50,100, 90, 20);
		 login_button.addActionListener(new GUI_login());
		 panel.add(login_button);
		 
		 JLabel or_label = new JLabel("or");
		 or_label.setBounds(160,100,80,25);
		 panel.add(or_label);
		 
		 register_button= new JButton("REGISTER");
		 register_button.setBounds(200,100, 90, 20);
		 panel.add(register_button);
		 		 
		 frame.setVisible(true);
		 
		 
		 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String user = userText.getText();
		System.out.println(user + ","+ "password");
		
	}

	
}
