package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("동물", 5);
		animal.info(); // 이름 : 동물, 나이: 5
		animal.sound(); // 동물이 소리를 냅니다.
		System.out.println();

		// Dog 객체 생성
		Dog dog = new Dog("바둑이", 3, "진돗개");
		dog.info(); // 이름 : 바둑이, 나이 : 3 //아무것도 없으니까 그냥 프린트 출력 
		dog.sound(); // 멍멍! 아무것도 없으니까 그냥 프린트 출력
		System.out.println("품종 : " + dog.getBreed()); // 품종 : 진돗개

		Dog dog2 = new Dog();
		dog2.info(); // 이름 : 정보없음, 나이 : 0

	}

}
