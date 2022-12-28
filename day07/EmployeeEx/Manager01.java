package kr.ac.kopo.day07.EmployeeEx;

// Manager01과 Employee 상속관계
// "Manager01은 Employee의 한 형태다"
public class Manager01 extends Employee {

	Employee[] empList;		/** 관리사원목록 */
	
	Manager01(String name, int salary, String grade, Employee[] empList) {
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









