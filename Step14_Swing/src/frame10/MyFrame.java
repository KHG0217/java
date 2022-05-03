package frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * ��Ʈ 
 * 
 * ���ڿ� ���ڷ� �ٲٱ�.
 * double num1=Double.parseDouble("���������� ���ڿ�");
 * 
 */
public class MyFrame extends JFrame implements ActionListener {
    //�ʵ忡 ����
    JButton plusBtn;
    JButton minusBtn;
    JButton multiBtn;
    JButton divideBtn;
    JTextField tf_num1;
    JTextField tf_num2;
    JLabel label_result;
      
    //������
   public MyFrame(String title) {
      super(title);

      
      //BorderLayout���� ���
      setLayout(new BorderLayout());
      
      //JPanel �ǳ�
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
     
      //Panel �� ���ʿ� ��ġ�ϱ� 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
      tf_num1=new JTextField(10);  
      topPanel.add(tf_num1);
      
      //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
      plusBtn=new JButton("+");
      minusBtn=new JButton("-");
      multiBtn=new JButton("*");
      divideBtn=new JButton("/");
      topPanel.add(plusBtn);
      topPanel.add(minusBtn);
      topPanel.add(multiBtn);
      topPanel.add(divideBtn);
      
      //�ι�° JTextField  ���� ��ο� �߰� �ϱ� 
      tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      
      //JLabel
      JLabel label1=new JLabel("=");
      label_result=new JLabel("0");
      
      //��ο� ���̺� �߰��ϱ�
      topPanel.add(label1);
      topPanel.add(label_result);
      
      //1. +,-,*,/ ��ư �����ϰ� �����
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);       
   }
   
   public static void main(String[] args) {
      JFrame f=new MyFrame("���� ������");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100,  100, 500, 500);
      f.setVisible(true);
   }
   

	@Override
	public void actionPerformed(ActionEvent e) {
	    //Exception �����
	    try {
		    	//������ ��ư ������ ���
		    	Object o = e.getSource();
				//�� ���ڿ��� ���ڷ� �ٲٱ�.
		    	double num1 = Double.parseDouble(tf_num1.getText());
		    	double num2 = Double.parseDouble(tf_num2.getText());
		    	//�ʵ��� ����� �������� ���Ͽ� ����
		    	if(o == plusBtn) {
			    	//������ Double�� ��������
			    	Double result = num1+num2;
			    	//result�� ���ڿ��� �ٲ��ֱ�
			    	String result_s=result.toString();
			    	//�� �ؽ�Ʈ�� result_s�� ����ϱ�.
			    	label_result.setText(result_s);
		    		
		    	}else if(o == minusBtn) {
		    		Double result = num1-num2;
		    		String result_s=result.toString();
		    		label_result.setText(result_s);
		    		
		    	}else if(o == multiBtn) {
		    		Double result = num1*num2;
		    		String result_s=result.toString();
		    		label_result.setText(result_s);
		    		
		    	}else if(o == divideBtn) {
		    		Double result = num1/num2;
		    		String result_s=result.toString();
		    		label_result.setText(result_s); 
		    	}
	    	
		   }catch(Exception nfe) {
		  	  String msg=nfe.getMessage();
		  	  System.out.println(msg+"�� ���ڰ� �ƴմϴ�.");
		    }	
		}  
}




