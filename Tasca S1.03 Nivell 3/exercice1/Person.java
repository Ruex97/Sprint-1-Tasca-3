package exercice1;



public class Person {
	private String name;
	private String surname;
	private String id;
	
	public Person(String name, String surname, String id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Surname=" + surname + ", Id=" + id + "]";
	}



	

}
