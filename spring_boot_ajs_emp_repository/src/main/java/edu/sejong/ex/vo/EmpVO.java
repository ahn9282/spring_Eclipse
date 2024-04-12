package edu.sejong.ex.vo;


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
	private String hiredate;
	private int sal;
	private String comm;
	private int deptno;
}
