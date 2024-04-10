package edu.sejong.ex.db;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DataSourceTest {

	// 주입
	@Autowired
	private DataSource dataSource;

	@Test
	void textConnection() {
		assertNotNull(dataSource);
		System.out.println("DS = " + dataSource);

		try (Connection conn = dataSource.getConnection()) {
			System.out.println("Cooooooooooon =  " + conn);
			assertThat(conn).isInstanceOf(Connection.class);
			log.info("아아아아아앙");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select 100 from dual");
			
			if(rs.next()){
				System.out.println("rs : " + rs.getLong(1));
				assertEquals(100, rs.getLong(1));
			}
			
		} catch (Exception e) {
			
		}
	}

}
