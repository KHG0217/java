package frame08;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 	JTextField ��ü�� �޼ҵ带 �� Ȱ���ؼ�
 * 
 * 	�޼����� �Է��ϰ� �������� ��ư�� ������
 * 
 * 	�̺��� �޼����� �˸�â�� ��µǵ��� ���α׷��� �� ������.
 */
public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);
		//���̾ƿ� ����
		setLayout(new FlowLayout());
		
		JTextField inputMsg=new JTextField(10);
		JButton btn=new JButton("��������");
		
		add(inputMsg);
		add(btn);
	}
	
	public static void main(String[] args) {
		JFrame f= new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}
}
