// abstract real time example

abstract class User {
	String name;
	
	// gets the type of user, for this class its always 1, hence static
	public static int getType() {
		return 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	abstract String biography();
}

class InstagramUser extends User {
	@Override
	String biography() {
		// TODO Auto-generated method stub
		return "b.tech student";
	}
}

public class Main3 {
	public static void main(String[] args) {
		InstagramUser igu = new InstagramUser();
		System.out.println(User.getType());
		igu.setName("Aditya");
		System.out.println(igu.getName());
		System.out.println(igu.biography());
	}
}
