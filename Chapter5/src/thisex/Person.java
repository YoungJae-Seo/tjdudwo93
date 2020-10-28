package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음",1); //this의 역할1. 생성자 안에서 생성자 호출할 때 사용.
	}
	
	public Person(String name, int age) {
		this.name = name; //this의 역할2. 생성자 안에서 멤버변수를 가리킬때 사용.
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + age);
	}
	
	public Person getSelf() {
		return this;
	}
	
}
