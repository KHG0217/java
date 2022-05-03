package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * 	JTextField 객체의 메소드를 잘 활용해서
 * 
 * 	메세지를 입력하고 눌러보셈 버튼을 누르면
 * 
 * 	이벽한 메세지가 알림창에 출력되도록 프로그래밍 해 보세요.
 */
public class MyFrame extends JFrame implements ActionListener {
	//필드선언
	JTextField inputMsg;
	
	public MyFrame(String title) {
		super(title);
		//레이아웃 설정
		setLayout(new FlowLayout());
		
		//생성한 JTextField 객체의 참조값을 필드에 저장하기
		this.inputMsg=new JTextField(10);
		JButton btn=new JButton("눌러보셈");
		
		add(inputMsg);
		add(btn);
		//버튼을 눌렀을때 감시할 객체 등록하기
		btn.addActionListener(this);
	}
	//필드
	static MyFrame gura;
	
	public static void main(String[] args) {
		JFrame f= new MyFrame("나의 프레임");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
		gura=(MyFrame)f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField에 입력한 문자열을 읽어와서
		String msg=this.inputMsg.getText();
		
		//2. 알림창에 띄우기
		JOptionPane.showMessageDialog(this,msg);
		//                    MyFrame.gura
		
	}
}
