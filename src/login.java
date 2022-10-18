import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLogin = new JLabel("ID");
		lbLogin.setBounds(82, 78, 19, 15);
		contentPane.add(lbLogin);
		
		tfID = new JTextField();
		tfID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) //Enter 키 누르면
					tfPW.requestFocus(); //pw 입력하는 컴포넌트 포커스이동
			}
		});
		tfID.setBounds(115, 75, 116, 26);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblPW = new JLabel("PW");
		lblPW.setBounds(82, 120, 57, 15);
		contentPane.add(lblPW);
		
		tfPW = new JTextField();
		tfPW.setBounds(115, 112, 116, 26);
		contentPane.add(tfPW);
		tfPW.setColumns(10);
		
		JButton btnLogin = new JButton("Login...");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strID = tfID.getText();
				String strPW = tfPW.getText();
				if(strID.equals("ici") && strPW.equals("123")) {
					//System.out.println("성공");
					winMain winMain = new winMain();
					winMain.setVisible(true);
				}
				else {
					winJoin winJoin = new winJoin();
					winJoin.setVisible(true);
					//System.out.println("실패");
				}
				
			}
		});
		btnLogin.setBounds(239, 75, 97, 64);
		contentPane.add(btnLogin);
		
		JButton btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785...");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winJoin winJoin = new winJoin();
				winJoin.setVisible(true);
			}
		});
		btnJoin.setBounds(80, 160, 256, 33);
		contentPane.add(btnJoin);
	}
}
