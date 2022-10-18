import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class winRandomColor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winRandomColor frame = new winRandomColor();
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
	public winRandomColor() {
		setTitle("Random Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) { //Double click
					int red   = (int)(Math.random()*256);
					int green = (int)(Math.random()*256);
					int blue  = (int)(Math.random()*256);
					contentPane.setBackground(new Color(red, green, blue));
					
				    setTitle("rgb("+red+","+ green + ","+blue+")");
				}
			}
		});
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { //Enter 키 누르면
					int red   = (int)(Math.random()*256);
					int green = (int)(Math.random()*256);
					int blue  = (int)(Math.random()*256);
					contentPane.setBackground(new Color(red, green, blue));
					
				    setTitle("rgb("+red+","+ green + ","+blue+")");
				}	
			}
		});
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
