package kr.ac.kopo.day07.my;

import kr.ac.kopo.day07.my.Employee;

import java.text.DecimalFormat;

public class Manager02 extends Employee {
    Employee[] empList;
    Manager02(String name, int salary, String grade, Employee[] empList){
        super(name, salary, grade);
        this.empList = empList;
    }

    @Override
    void info() {
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("이름: " + name + "\t급여: " + salary + "\t직급: " + grade);
        System.out.println("----------------------------------------");
        System.out.println("<관리 사원 목록>");
        for (Employee e : empList) {
            e.info();
        }
        System.out.println("----------------------------------------");
    }

}
