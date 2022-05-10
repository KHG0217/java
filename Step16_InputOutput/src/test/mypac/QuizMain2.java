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
 *  1.JTesnField�� ���ڿ��� �Է��ϰ� �߰���ư�� ������
 *    �Է��� ���ڿ��� myFolder/memo.txt���Ͽ� append �ǵ��� �غ�����.
 *  
 *  2. �ҷ����� ��ư�� ������ myFolder/memo.txt���Ͽ� �ִ� ��� ���ڿ���
 *     JTextArea�� ��µǵ��� �غ�����.
 */
public class QuizMain2 extends JFrame implements ActionListener {
   //�ʵ�
   JTextField tf_msg;
   JTextArea area; 
   JButton appendBtn;
   JButton loadBtn;
   //������
   public QuizMain2() {
      setTitle("���� ������");
      setLayout(new BorderLayout());
      
      JPanel topPanel=new JPanel();
      //JTextField ��ü�� �������� �ʵ忡 ���� 
      tf_msg=new JTextField(10);
      
      appendBtn=new JButton("�߰��ϱ�");
      loadBtn=new JButton("�ҷ�����");
      appendBtn.setActionCommand("append");
      loadBtn.setActionCommand("load");
          
      topPanel.add(tf_msg);
      topPanel.add(appendBtn);
      topPanel.add(loadBtn);
      
      add(topPanel, BorderLayout.NORTH);
      topPanel.setBackground(Color.YELLOW);
      
      //��ư�� ������ �߰��ϱ�
      appendBtn.addActionListener(this);
      loadBtn.addActionListener(this);

      
      //JTextArea
      area=new JTextArea();
      //�������� ����� JTextArea  ��ġ�ϱ�
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