package kr.ac.kopo.day07.my;
import java.text.DecimalFormat;
public class Employee {
    String name;    // 이름
    int salary;     // 급여
    String grade;   // 직급

    Employee() {}

    Employee (String name, int salary, String grade) {
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    void info(){
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("사원명: " + name + "\t급여: " + df.format(salary) + "만원\t직급: " + grade);
    }
}
