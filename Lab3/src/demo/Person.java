package demo;

public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	//constructor
	public Person(String name, int birthdate){
		this.name = name;
		this.birthdate = birthdate;
		this.age = current_year - birthdate; // calculate age in constructor
	}

	// reset birthday
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	//combine all the output methods into one method
	public void display_info(){
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthdate);
		System.out.printf("I am %d years old ",age);
		this.medTest(age);
	}
	
	// test the age for Medicare qualification
	public void medTest(int age)
	{
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_info();
	}
}
