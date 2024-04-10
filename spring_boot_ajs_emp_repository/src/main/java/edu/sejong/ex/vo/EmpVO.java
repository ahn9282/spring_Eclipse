package edu.sejong.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {

	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private Timestamp hiredate;
	private int sal;
	private String comm;
	private int deptno;
}
