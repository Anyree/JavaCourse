/**
 * Java 1. Homework #5
 *
 * @author Rozental Irina
 * @version 25.02.2022
 *
 */
class HomeWork5 {
	
	public static void main(String[] args) {
		Employee[] employees = {
			new Employee("Ivanov Ivan", "Engineer",
			    "ivanov@mail.com", "2222222", 30000, 30),
			new Employee("Petrov Petr", "Lead Engineer",
                "petro@mail.com", "9999999", 40000, 40),
            new Employee("Vasilev Vasil", "Head of Department",
                "vasya@mail.com", "6666666", 50000, 50),
            new Employee("Sidorov Sidor", "Manager",
			    "sidir@mail.com", "7777777", 60000,60),
			new Employee("Sergeev Sergey", "QA Engineer",
			    "sergey@mail.com", "1111111", 70000, 20)
		};
		
		for (Employee employee : employees) {
			if (employee.getAge() > 40) {
				System.out.println(employee);
			}
		}
	}
}

class Employee {
	private String name;
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age;
	
	public Employee(String name, String position, String email, String phone, 
	        int salary, int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;				
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return (name + 
		    "\n| Position: " + position + 
			"\n| Email: " + email +
			"\n| Phone: " + phone +
			"\n| Salary: " + salary +
			"\n| Age: " + age);
	}
}