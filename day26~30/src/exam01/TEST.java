package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TEST {

	public static void main(String[] args) {
		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("�����ͺ��̽� ���� ����!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
