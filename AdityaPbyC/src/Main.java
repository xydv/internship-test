
public class Main {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Principal principal = new Principal();
		System.out.println(teacher.getSalary(10000));
		System.out.println(principal.gelSalary(100000, 10000));
	}
}
