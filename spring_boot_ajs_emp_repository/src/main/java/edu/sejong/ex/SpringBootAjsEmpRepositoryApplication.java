package edu.sejong.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"edu.sejong.ex.mapper"})
public class SpringBootAjsEmpRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAjsEmpRepositoryApplication.class, args);
	}

}
