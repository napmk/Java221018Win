import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WinLabelEx extends JFrame {

   private JPanel contentPane;
   private JTextField tfType;
   private JLabel lblPic;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinLabelEx frame = new WinLabelEx();
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
   public WinLabelEx() {
      setTitle("레이블 연습(Typing)");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 617, 496);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblDisplay = new JLabel("Typing...");
      lblDisplay.setFont(new Font("굴림", Font.BOLD, 20));
      lblDisplay.setBounds(48, 10, 334, 45);
      contentPane.add(lblDisplay);
      
      tfType = new JTextField();
      tfType.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
               lblDisplay.setText(tfType.getText());
               tfType.setText("");
            }
         }
      });
      tfType.setToolTipText("입력 후 Enter");
      tfType.setBounds(48, 75, 334, 21);
      contentPane.add(tfType);
      tfType.setColumns(10);
      
      //사람
      lblPic = new JLabel("");
      lblPic.setIcon(new ImageIcon(("images/가위.png")));//절대경로는쓰지마세요
      lblPic.setBackground(new Color(255, 255, 255));
      lblPic.setBounds(48, 114, 235, 191);
      lblPic.setOpaque(true); // 추가
      contentPane.add(lblPic);
      
      //컴퓨터
      JLabel lblComPic = new JLabel("computer");
      lblComPic.setOpaque(true);
      lblComPic.setBackground(new Color(255, 255, 255));
      lblComPic.setBounds(353, 114, 235, 191);
      contentPane.add(lblComPic);
      
      
      
      JButton btnGawi = new JButton("가위");
      btnGawi.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		ImageIcon image = new ImageIcon("images/가위.png");
      		lblPic.setIcon(image);
      		String Choice[] = {"가위" , "바위" ,"보"};
      		int index = (int)(Math.random()*3);
      		ImageIcon image1 = new ImageIcon("images/"+ Choice[index] +".png");
      		lblComPic.setIcon(image1);
      		if (lblPic == lblComPic)
      			System.out.println("비김");
      		
      		
      	
      		
//      		System.out.println(computer + " vs. " + human);
//            if(computer == human)
//               System.out.println("비김");
//            else if((computer+1)%3 == human)
//               System.out.println("이김");
//            else 
//               System.out.println("짐");  

            
      	}
      });
      btnGawi.setBounds(48, 330, 76, 34);
      contentPane.add(btnGawi);
      
      JButton btnBawi = new JButton("바위");
      btnBawi.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		ImageIcon image = new ImageIcon("images/바위.png");
      		lblPic.setIcon(image);

      		String Choice[] = {"가위" , "바위" ,"보"};
      		int index = (int)(Math.random()*3);
      		ImageIcon image1 = new ImageIcon("images/"+ Choice[index] +".png");
      		lblComPic.setIcon(image1);
      	}
      });
      btnBawi.setBounds(129, 330, 76, 34);
      contentPane.add(btnBawi);
      
      JButton btnBo = new JButton("보");
      btnBo.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		ImageIcon image = new ImageIcon("images/보.png");
      		lblPic.setIcon(image);

      		String Choice[] = {"가위" , "바위" ,"보"};
      		int index = (int)(Math.random()*3);
      		ImageIcon image1 = new ImageIcon("images/"+ Choice[index] +".png");
      		lblComPic.setIcon(image1);
      	}
      });
      btnBo.setBounds(211, 330, 76, 34);
      contentPane.add(btnBo);
      
    
      
      JLabel lblNewLabel = new JLabel("vs");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
      lblNewLabel.setBounds(307, 198, 34, 34);
      contentPane.add(lblNewLabel);
      
      JLabel lblResult = new JLabel("결과값");
      lblResult.addMouseListener(new MouseAdapter() {
      
      	@Override
      	public void mouseClicked(MouseEvent e) {
      	  btnGawi.setText(lblResult.getText());
          lblResult.setText("");
      	}
      });
   
      lblResult.setBounds(263, 409, 57, 15);
      contentPane.add(lblResult);
   }
}