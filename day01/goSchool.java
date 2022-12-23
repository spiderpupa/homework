package kr.ac.kopo.day01;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class goSchool {
    public static void main(String[] args){
        String now = LocalTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분"));
        System.out.printf("현재 시각은 %s, 아침에 일어나서 ", now);
        String wakeup = LocalTime.now().format(DateTimeFormatter.ofPattern("HH"));
        int time = Integer.parseInt(wakeup);
        if (time < 7){
            System.out.print("밥먹고");
        }
        else {
            System.out.print("밥먹지 않고");
        }
        System.out.println(" 학교에 간다");
    }
}
