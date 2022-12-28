package kr.ac.kopo.day07.my;
import java.text.DecimalFormat;

public class Manager {
    String name;
    int salary;
    String grade;
    Employee[] empList;

    Manager(String name, int salary, String grade, Employee[] empList){
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.empList = empList;
    }

    void info(){
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("이름: " + name + "\t급여: " + salary + "\t직급" + grade );
        System.out.println("----------------------------------------");
        System.out.println("<관리 사원 목록>");
        for(Employee e : empList){
            e.info();
        }
        System.out.println("----------------------------------------");
    }
}
