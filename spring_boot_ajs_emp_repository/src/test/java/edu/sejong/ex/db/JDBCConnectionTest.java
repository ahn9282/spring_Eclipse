package edu.sejong.ex.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

class JDBCConnectionTest {

	@Test
	void testConnection() {
		
		// 1. 연결 문자열 생성
		// -접속에 필요한 정보로 구성된 문자열, Connection String
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //localhost대신 ip주소가 들어갈수도
		String id = "scott";
		String pw = "tiger";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);			
			System.out.println(conn.isClosed()?"접속 종료":"정속 중");
			
			
			
			conn.close();
			System.out.println(conn.isClosed()?"접속 종료":"정속 중");
			
		} catch (Exception e) {
		}
	}

}
