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
 * 힌트 
 * 
 * 문자열 숫자로 바꾸기.
 * double num1=Double.parseDouble("숫자형태의 문자열");
 * 
 */
public class MyFrame extends JFrame implements ActionListener {
    //필드에 지정
    JButton plusBtn;
    JButton minusBtn;
    JButton multiBtn;
    JButton divideBtn;
    JTextField tf_num1;
    JTextField tf_num2;
    JLabel label_result;
      
    //생성자
   public MyFrame(String title) {
      super(title);

      
      //BorderLayout으로 사용
      setLayout(new BorderLayout());
      
      //JPanel 판넬
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
     
      //Panel 을 북쪽에 배치하기 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField 객체를 만들에서 JPanel 에 추가하기 
      tf_num1=new JTextField(10);  
      topPanel.add(tf_num1);
      
      //기능 버튼 객체를 만들어서 JPanel 에 추가하기
      plusBtn=new JButton("+");
      minusBtn=new JButton("-");
      multiBtn=new JButton("*");
      divideBtn=new JButton("/");
      topPanel.add(plusBtn);
      topPanel.add(minusBtn);
      topPanel.add(multiBtn);
      topPanel.add(divideBtn);
      
      //두번째 JTextField  만들어서 페널에 추가 하기 
      tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      
      //JLabel
      JLabel label1=new JLabel("=");
      label_result=new JLabel("0");
      
      //페널에 레이블 추가하기
      topPanel.add(label1);
      topPanel.add(label_result);
      
      //1. +,-,*,/ 버튼 동작하게 만들기
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);       
   }
   
   public static void main(String[] args) {
      JFrame f=new MyFrame("나의 프레임");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100,  100, 500, 500);
      f.setVisible(true);
   }
   

	@Override
	public void actionPerformed(ActionEvent e) {
	    //Exception 만들기
	    try {
		    	//눌러진 버튼 참조값 얻기
		    	Object o = e.getSource();
				//얻어낸 문자열을 숫자로 바꾸기.
		    	double num1 = Double.parseDouble(tf_num1.getText());
		    	double num2 = Double.parseDouble(tf_num2.getText());
		    	//필드의 저장된 참조값과 비교하여 구분
		    	if(o == plusBtn) {
			    	//참조값 Double에 결과값담기
			    	Double result = num1+num2;
			    	//result를 문자열로 바꿔주기
			    	String result_s=result.toString();
			    	//라벨 텍스트를 result_s로 출력하기.
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
		  	  System.out.println(msg+"는 숫자가 아닙니다.");
		    }	
		}  
}




