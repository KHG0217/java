package test.main;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC (Java DataBase Connectivity)
 * 
 * DataBase�� �����ؼ� SELECT, INSERT, UPDATE, DELETE �۾��ϱ�
 * 
 * Oracle�� �����ϱ� ���ؼ��� ����̹� Ŭ������ ����մ� ojdbc6.jar ������
 * ����� �� �ֵ��� �ؾ��Ѵ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB ���ᰴü�� ���� �������� ����� (����)
		Connection conn=null;
		
		//����Ŭ ����̹� �ε�
		try {
			              //�Ʊ� ������ �帮�̹�
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        //������ DB �� ���� @�������ּ�:port��ȣ:db�̸�
	        String url="jdbc:oracle:thin:@localhost:1521:xe";
	        //                     localhost:�ڱ��ڽ��� ip�ּ�=(127.0.0.1)=(�ڹ�,����Ŭ�� ���� ��ǻ�Ϳ� �ִٸ�)
	        //                     ����Ŭ�� �ٸ���ǻ�Ϳ� �ִٸ� �ٸ���ǻ�� ip �Է�
	        //���� ��й�ȣ�� �̿��ؼ� Connection ��ü�� ������ ������(�޼ҵ��)
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        //���ܰ� �߻����� �ʰ� ������� ��������� �������� ���� �����̴�.
	        System.out.println("Oracle DB ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		PreparedStatement pstmt=null;//(����)
		ResultSet rs=null; //(������ ���)
		try {
			//������ sql��
			String sql ="Select num,name,addr FROM member"
					+ " ORDER BY num ASC";//�տ� ��ĭ �ݵ�� ����
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			
			//PreparedStatement ��ü�� �̿��ؼ� query�� �����ϰ�
			//����� ResultSet ��ü�� �޾ƿ���
			rs=pstmt.executeQuery();
			/*
			 * 	ResultSet ��ü�� .next() �޼ҵ�� cursor �ؿ� row�� �����ϴ� �� Ȯ���ؼ�
			 * 	���� �����Ѵٸ� true�� �����ϰ�, cursor�� ��ĭ ������ �̵��Ѵ�.
			 * 	���� �������� ������ false�� �����Ѵ�.
			 */
			while(rs.next()) {
				//���� cursor�� ��ġ�� ������ num�̶�� Į���� ���� ����
				//               "Į����"�� �ǰ� ���ڵ� ��
				int num=rs.getInt("num");
				//���� cursor�� ��ġ�� ������ name�̶�� Į���� ���ڿ��� ����
				String name=rs.getString("name");
				//���� cursor�� ��ġ�� ������ addr�̶�� Į���� ���ڿ� ����
				String addr=rs.getString("addr");
				//�ܼ�â�� ����غ���
				System.out.println(num+" | "+name+" | "+addr);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
