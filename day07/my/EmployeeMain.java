package kr.ac.kopo.day07.my;

import kr.ac.kopo.day07.my.Employee;
import kr.ac.kopo.day07.my.Manager01;
import kr.ac.kopo.day07.my.Manager02;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("홍길동", 3_200, "사원");
        Employee e2 = new Employee("고길동", 3_400, "사원");
        Employee e3 = new Employee("강길동", 3_600, "대리");
        Employee e4 = new Employee("윤길동", 3_600, "대리");
        Employee e5 = new Employee("한길동", 4_100, "과장");

        Employee[] empList = {e, e2, e4};
//		Manager m = new Manager("나관리", 7_000, "부장", empList);
//		Manager01 m = new Manager01("나관리", 7_000, "부장", empList);
        Manager02 m = new Manager02("나관리", 7_000, "부장", empList);

        e.info();
        e2.info();
        e3.info();
        e4.info();
        e5.info();

        m.info();
    }
}
