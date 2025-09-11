package Ch08.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SAMPLE {
	// DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";

	// JDBC참조변수
	private static Connection conn = null; // DBMS 의 특정 DB와 연결되는 객체
	private static PreparedStatement pstmt = null; // SQL Query 전송용 객체
	private static ResultSet rs = null; // Select 결과물 담을 객체

	public static void conn() throws SQLException {
	}

//	public static List<BookDto> selectAll() throws SQLException {
//		return null;
//	}
//
//	public static BookDto select(Long bookCode) throws SQLException {
//		return null;
//	}

	public static int insertBook(BookDto bookDto) throws SQLException {
		return -1;
	}

//	public static int updateBook(BookDto bookDto) throws SQLException {
//		return -1;
//	}
//
//	public static int deleteBook(BookDto bookDto) throws SQLException {
//		return -1;
//	}

	public static void main(String[] args) {
		try {
			// DBCONN
			conn();
			
			//TX START

			// INSERT
			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
			insertBook(new BookDto(2L, "도서명1", "출판사명1", "isbn-1"));
			insertBook(new BookDto(3L, "도서명1", "출판사명1", "isbn-1"));
			insertBook(new BookDto(4L, "도서명1", "출판사명1", "isbn-1"));
			
			// SELECTALL
			Liste<BookDto> allBook = selectAll();
			System.out.println("SelectAll : ");
			allBook.forEach(System.out::println);
			// SELECT
			BookDto dto = select(1L);
			System.out.println("select : " + dto);
			// UPDATE
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);
			if (r1 > 0)
				System.out.println("수정완료 : " + r1);

			// DELETE
			int r2 = deleteBook(dto);
			if (r2 > 0)
				System.out.println("삭제완료 : " + r2);

			//TX END
		} catch (Exception e) {
			//TX ROLLBACKALL
		}

	}

}
