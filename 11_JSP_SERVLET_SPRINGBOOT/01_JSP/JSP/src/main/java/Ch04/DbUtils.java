package Ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Ch02.UserDto;

public class DbUtils {
	//�Ӽ�(DB ������õ� ���)
	//DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/opendatadb";

	//JDBC��������
	private static Connection conn = null; // DBMS �� Ư�� DB�� ����Ǵ� ��ü
	private static PreparedStatement pstmt = null; // SQL Query ���ۿ� ��ü
	private static ResultSet rs = null; // Select ����� ���� ��ü
	
	//���
	public static void conn() throws Exception
	{
		//����̺� Ŭ���� �޸� ���� ����
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		//Connection conn ����� Connection ��ü ����
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED...");
	}

	public static void disConn() throws Exception {
		//rs / pstmt / conn close ó��
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
	}
	
	
	public static int insertUser(UserDto dto) throws Exception 
	{
		pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?,?,?)");
		pstmt.setString(1, dto.getUserid());
		pstmt.setString(2, dto.getPassword());
		pstmt.setString(3, dto.getUsername());
		pstmt.setString(4, dto.getZipcode());
		pstmt.setString(5, dto.getAddr1());
		pstmt.setString(6, dto.getAddr2());
		int result = pstmt.executeUpdate();
		
		return result;

	}
	public static UserDto selectUser(String userid) throws Exception{
		
		pstmt = conn.prepareStatement("select * from tbl_user where userid=?");
		pstmt.setString(1,userid);
		rs = pstmt.executeQuery();
		UserDto  dto = null;
		if(rs != null) {
			if(rs.next()) {
				dto = new UserDto();
				dto.setUserid(rs.getString("userid"));
				dto.setPassword(rs.getString("password"));
				dto.setUsername(rs.getString("username"));
				dto.setUsername(rs.getString("zipcode"));
				dto.setAddr1(rs.getString("addr1"));
				dto.setAddr2(rs.getString("addr2"));
			}
		}
		
		//tbl_member �� userid �� ��ġ�ϴ� ������ �޾ƿ� MemberDto�� ��ȯ  
		return dto;
	}
	
	public static void TxStart() throws Exception{
		if(conn!=null)
			conn.setAutoCommit(false);
	}
	public static void TxEnd() throws Exception {
		if(conn!=null)
			conn.commit();
	}
	public static void RollBack() throws Exception {
		if(conn!=null)
			conn.rollback();	
	}
	
}
