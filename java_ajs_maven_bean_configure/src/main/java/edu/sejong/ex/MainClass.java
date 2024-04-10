package edu.sejong.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = ac.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName() + "입니다.");
		System.out.println("나이: " + student1.getAge() + "입니다.");
		System.out.println("취미 : " + student1.getHobbys() + "입니다.");
		System.out.println("신장: " + student1.getHeight() + "입니다.");
		System.out.println("몸무게 : " + student1.getWeight() + "입니다.");
		student1.setAge(29);
		System.out.println("학생의 나이는 " + student1.getAge() + "세 입니다.");

		/*
		 * Student student2 = (Student)ac.getBean("student2");
		 * System.out.println("이름 : " + student2.getName() + "입니다.");
		 * System.out.println("나이: " + student2.getAge() + "입니다.");
		 * System.out.println("취미 : " + student2.getHobbys() + "입니다.");
		 * System.out.println("신장: " + student2.getHeight() + "입니다.");
		 * System.out.println("몸무게 : " + student2.getWeight() + "입니다.");
		 */

		Student student6 = (Student) ac.getBean("student6");
		System.out.println("이름 : " + student6.getName() + "입니다.");
		System.out.println("나이: " + student6.getAge() + "입니다.");
		System.out.println("취미 : " + student6.getHobbys() + "입니다.");
		System.out.println("신장: " + student6.getHeight() + "입니다.");
		System.out.println("몸무게 : " + student6.getWeight() + "입니다.");

		Grade grade = (Grade) ac.getBean("grade");
		System.out.println("성적  - 국어 : " + grade.getKor() + ", 수학 : " + grade.getMath() + ", 영어 : " + grade.getEng());
		System.out.println(grade.total());
		System.out.println(grade.average());
		System.out.println(grade.getGrade());
	}

}
