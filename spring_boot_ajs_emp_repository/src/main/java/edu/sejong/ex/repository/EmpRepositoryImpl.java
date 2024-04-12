package edu.sejong.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.EmpVO;

@Repository // @Component + 의미(DAO)
public class EmpRepositoryImpl implements EmpRepository {

	@Autowired
	private DataSource dataSource;

	@Override
	public List<EmpVO> showList() {

		ArrayList<EmpVO> empList = new ArrayList<EmpVO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from emp order by hiredate";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				EmpVO emp = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				empList.add(emp);

			}

		} catch (Exception e) {
			
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return empList;
	}

	@Override
	public void insertEmp(EmpVO emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "insert into emp (empno, ename, job, mgr, hiredate, sal,comm,deptno) values (?,?,?,?,sysdate,?,?,?)";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setString(4, emp.getMgr());
			pstmt.setInt(5, emp.getSal());
			pstmt.setString(6, emp.getComm());
			pstmt.setInt(7, emp.getDeptno());
			pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void removeEmp(EmpVO emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "delete from emp where empno = ?";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpno());
	
			pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
