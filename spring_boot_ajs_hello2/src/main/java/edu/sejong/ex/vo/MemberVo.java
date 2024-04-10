package edu.sejong.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data  //   (@Getter + @Setter + @NoArgsConstructor + @AllArgsConstructor + @ToString)
public class MemberVo {

	
	private String name;
	private String email;
	private String id;
	private String pw;
	private int age;
}
