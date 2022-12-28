package kr.ac.kopo.day07.EmployeeEx;

public class Manager {

	String name;
	int salary;
	String grade;
	Employee[] empList;		/** 관리사원목록 */
	
	Manager(String name, int salary, String grade, Employee[] empList) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("----------------------------------------");
		System.out.println("\t< 관리사원 목록 >");
		System.out.println("----------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}









