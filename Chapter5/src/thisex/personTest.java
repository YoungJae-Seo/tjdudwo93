package thisex;

public class personTest {

	public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("Lee",20);
		personLee.showInfo();
		System.out.println(personLee);
		
		
		System.out.println(personLee.getSelf());
		
	}

}
