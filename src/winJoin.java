import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class winJoin extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfPW;
	private JTextField tfPWOk;
	private JTextField tfName;
	private JTextField tfTel;
	private JButton btnJoin;
	private JLabel lblNewLabel;


	public winJoin() {
		setTitle("\uC2E4\uD328\uD558\uBA74 \uD68C\uC6D0\uAC00\uC785\uD574\uC8FC\uC138\uC694");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbID = new JLabel("ID");
		lbID.setBounds(42, 88, 27, 15);
		contentPane.add(lbID);
		
		tfID = new JTextField();
		tfID.setBounds(96, 85, 183, 21);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		tfPW = new JTextField();
		tfPW.setColumns(10);
		tfPW.setBounds(96, 113, 183, 21);
		contentPane.add(tfPW);
		
		JLabel lbPW = new JLabel("PW");
		lbPW.setBounds(42, 116, 27, 15);
		contentPane.add(lbPW);
		
		tfPWOk = new JTextField();
		tfPWOk.setColumns(10);
		tfPWOk.setBounds(96, 142, 183, 21);
		contentPane.add(tfPWOk);
		
		JLabel lbName = new JLabel("\uC774\uB984");
		lbName.setBounds(42, 176, 27, 15);
		contentPane.add(lbName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(96, 173, 183, 21);
		contentPane.add(tfName);
		
		JLabel lbTel = new JLabel("TEL");
		lbTel.setBounds(42, 210, 27, 15);
		contentPane.add(lbTel);
		
		tfTel = new JTextField();
		tfTel.setColumns(10);
		tfTel.setBounds(96, 207, 183, 21);
		contentPane.add(tfTel);
		
		btnJoin = new JButton("회원가입");
		btnJoin.setBackground(new Color(0, 128, 255));
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJoin.setBounds(42, 247, 237, 31);
		contentPane.add(btnJoin);
		
		lblNewLabel = new JLabel("\uAC00\uC785\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(93, 35, 141, 15);
		contentPane.add(lblNewLabel);
	}

}
