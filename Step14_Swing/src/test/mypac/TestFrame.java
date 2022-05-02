package test.mypac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame {
	
	//생성자
	public TestFrame(String title) {
		super(title);
		
		this.setBounds(100, 100, 500, 500);
		//프레임을 닫았을때 자동으로 프로세스 종료 되도록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저를 사용하지 않도록 설정
		this.setLayout(null);
		//프레임이 보이도록 한다.
		this.setVisible(true);
		
		//버튼객체 생성해서
		JButton btn=new JButton("눌러보셈");
		//표시될 위치와 크기를 지정 후
		btn.setBounds(10, 10, 100, 40);

		//프레임에 추가하기 this. 생략가능
		add(btn);
		
		//프레임이 보이도록 한다.
		setVisible(true);

	}
}
