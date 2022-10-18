import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class winMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	public winMain() {
		setTitle("Login sucess!!");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {// 필요한소스만 불러씀
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
