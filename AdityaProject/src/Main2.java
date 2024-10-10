// overloading and overriding real time example

class Teacher {
	void getDetails(String name) {
		System.out.println("this is " + name);
	}
	
	void getDetails(String name, String expertise) {
		System.out.println("this is "+ name + " and expertise is "+ expertise );
	}
}

class Principal extends Teacher {
	@Override
	void getDetails(String name) {
		// TODO Auto-generated method stub
		System.out.println("this is "+ name + " and it is a principal");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Principal principal = new Principal();
		teacher.getDetails("Aditya");
		teacher.getDetails("Swapnil", "Physics");
		principal.getDetails("Kavita");
	}
}
