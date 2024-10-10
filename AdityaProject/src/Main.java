// question 1

class Employee {
	String name;
	int id;
	float salary;
	String address;
	
	Employee(String name, int id, float salary, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id =id;
		this.salary = salary;
		this.address = address;
	}
	
	public void getAllInfo() {
		System.out.println("name is "+ name);
		System.out.println("id is "+ id);
		System.out.println("salary is "+ salary);
		System.out.println("address is "+ address);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee  = new Employee("Aditya", 1, 12000, "Dahisar");
		employee.getAllInfo();
		System.out.println(employee);
	}
}
