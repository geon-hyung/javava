package day10;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
//        2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
//        3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
//        4. hong 객체에서 getAge 호출 후 해당 값 출력
//		5. yu 객체에서 toString 메소드 리턴 결과를 화면에 출력
		Student hong = new Student(1234,"홍길동");
		System.out.println(hong.toString());
		
		Student yu = new Student(1357,"유재석", "컴퓨터학과");
		
		hong.setInfo(20, "남"); // 3번 
		System.out.println(hong.getAge()); //4번
		
		System.out.println(yu);
				

	}

}
