import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class FirtsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtfield;
	private JPasswordField passwordfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirtsWindow frame = new FirtsWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirtsWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfield = new JTextField();
		txtfield.setBounds(356, 232, 131, 20);
		contentPane.add(txtfield);
		txtfield.setColumns(10);
		
		
		JLabel lbl2 = new JLabel("Login: ");
		lbl2.setBackground(new Color(135, 206, 250));
		lbl2.setFont(new Font("Arial", Font.BOLD, 11));
		lbl2.setBounds(300, 235, 46, 14);
		contentPane.add(lbl2);
		
		JLabel lbl1 = new JLabel("Senha:");
		lbl1.setFont(new Font("Arial", Font.BOLD, 11));
		lbl1.setBounds(300, 277, 46, 14);
		contentPane.add(lbl1);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(356, 274, 131, 20);
		contentPane.add(passwordfield);
		
		Button button = new Button("Entrar");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(SystemColor.desktop);
		button.setBackground(new Color(255, 255, 224));
		button.setBounds(386, 315, 70, 22);
		contentPane.add(button);
		
		
		JLabel lblimg = new JLabel("");
		lblimg.setBackground(Color.LIGHT_GRAY);
		lblimg.setIcon(new ImageIcon(FirtsWindow.class.getResource("/img/aa.jpg")));
		lblimg.setBounds(377, 109, 79, 80);
		contentPane.add(lblimg);
	}
}
/////
