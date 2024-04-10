package edu.sejong.ex;

public class Grade {
 private int kor;
 private int eng;
 private int math;
 
 public Grade() {
	 
 }


public int getKor() {
	return kor;
}

public void setKor(int kor) {
	this.kor = kor;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

public int getMath() {
	return math;
}

public void setMath(int math) {
	this.math = math;
}
 
 public String total() {
	 return "총점 : " + (kor+eng+math)+ "입니다."; 
 }
public String average() {
	
	return "평균 : " +(kor+eng+math)/3.0+"입니다."	;
	 
 }
public String getGrade() {
	 if((kor+eng+math)/3.0>=90) {
         return "수입니다";
      }else if((kor+eng+math)/3.0>=80) {
         return "우입니다";
      }else if((kor+eng+math)/3.0>=70) {
         return "미입니다";
      }else if((kor+eng+math)/3.0>=60) {
         return "양입니다";
      }else {
         return "가입니다";
      }

}
}
