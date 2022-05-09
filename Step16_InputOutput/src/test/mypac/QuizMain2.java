package test.mypac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 *  1.JTesnField에 문자열을 입력하고 추가버튼을 누르면
 *    입력한 문자열이 myFolder/memo.txt파일에 append 되도록 해보세요.
 *  
 *  2. 불러오기 버튼을 누르면 myFolder/memo.txt파일에 있는 모든 문자열을
 *     JTextArea에 출력되도록 해보세요.
 */
public class QuizMain2 extends JFrame implements ActionListener {
   //필드
   JTextField tf_msg;
   JTextArea area; 
   JButton appendBtn;
   JButton loadBtn;
   //생성자
   public QuizMain2() {
      setTitle("나의 프레임");
      setLayout(new BorderLayout());
      
      JPanel topPanel=new JPanel();
      //JTextField 객체의 참조값을 필드에 저장 
      tf_msg=new JTextField(10);
      
      appendBtn=new JButton("추가하기");
      loadBtn=new JButton("불러오기");
      appendBtn.setActionCommand("append");
      loadBtn.setActionCommand("load");
          
      topPanel.add(tf_msg);
      topPanel.add(appendBtn);
      topPanel.add(loadBtn);
      
      add(topPanel, BorderLayout.NORTH);
      topPanel.setBackground(Color.YELLOW);
      
      //버튼에 리스너 추가하기
      appendBtn.addActionListener(this);
      loadBtn.addActionListener(this);

      
      //JTextArea
      area=new JTextArea();
      //프레임의 가운데에 JTextArea  배치하기
      add(area, BorderLayout.CENTER);
   
   }
   
   public static void main(String[] args) {
      QuizMain2 f=new QuizMain2();
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
      

      

      
      
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm=e.getActionCommand();
		String str=tf_msg.getText();
		File memoFile=new File("c:/acorn202203/myFolder/memo.txt");
		FileWriter fw=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		if(cm.equals("append")) {	      	      
		      try {
				fw =new FileWriter(memoFile,true);
				fw.write(str);
				fw.write("\r\n");
				fw.flush();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}else if(cm.equals("load")) {
			try {
				fr=new FileReader(memoFile);
				br=new BufferedReader(fr);
				try {
					while(true) {
					String msg=br.readLine();
					if(msg==null) 
						break;											
					area.append(msg);
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	}
	

}