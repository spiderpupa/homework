package kr.ac.kopo.day07.EmployeeEx;

// Manager01과 Employee 상속관계
// "Manager01은 Employee의 한 형태다"
public class Manager02 extends Employee {

	Employee[] empList;		/** 관리사원목록 */
	
	Manager02(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}
	
	void info() {
		super.info();
		System.out.println("----------------------------------------");
		System.out.println("\t< 관리사원 목록 >");
		System.out.println("----------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}









