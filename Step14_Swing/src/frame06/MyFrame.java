package frame06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//필요한 참조값을 필드에 담기.
	JButton sendBtn;
	JButton removeBtn; 
	
	//생성자
   public MyFrame(String title) {
      super(title);
      //MyFrame 의 레이아웃 매니저 지정하기
      setLayout(new FlowLayout());
      //버튼
      sendBtn = new JButton("전송");
      removeBtn= new JButton("삭제");
      //프레임 버튼 추가하기 (FlowLayout의 영향을 받는다.)
      add(sendBtn);
      add(removeBtn);
      
      sendBtn.addActionListener(this);
      removeBtn.addActionListener(this);
   }   
   
   public static void main(String[] args) {
      JFrame f=new MyFrame("나의 프레임");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 500, 500);
      f.setVisible(true);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		//JFrame a =this;
		//MyFrame b =this;
		//Component c =this;
		//ActionListener d =this;
		
		//눌러진 버튼의 참조값 얻어오기
		Object o = e.getSource();
		
		//눌러진 버튼의 참조값과 필드에 저장된 참조값을 비교해 분기한다.
		if(o == sendBtn) {
			JOptionPane.showMessageDialog(this, "전송합니다.");
		}else if(o == removeBtn) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
		}
		
		
		
   
}



