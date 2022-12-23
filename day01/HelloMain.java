package kr.ac.kopo.day01;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class HelloMain {
//    메소드는 name() 형태로 작성
//    메인 메소드는 프로그램의 시작과 끝을 알림
    public static void main(String[] args) {
//    자바는 코드 작성 시 자동으로 컴파일을 시켜 문법 오류를 파악
//    인터프리터를 통하여 명령어를 실행
        System.out.println("안녕하세요");
//        println에 괄호가 붙었으므로 println이 메소드
        String comment;
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH"));
        if (Integer.parseInt(currentTime)>=0 & Integer.parseInt(currentTime)<6){
            comment = "밤이 깊었습니다";
        } else if (Integer.parseInt(currentTime)>=6 & Integer.parseInt(currentTime)<10){
            comment = "좋은 아침입니다";
        } else if (Integer.parseInt(currentTime)>=10 & Integer.parseInt(currentTime)<12) {
            comment = "일할 시간입니다";
        } else if (Integer.parseInt(currentTime)>=12 & Integer.parseInt(currentTime)<14) {
            comment = "오늘 점심은 무엇일까요";
        } else if (Integer.parseInt(currentTime)>=14 & Integer.parseInt(currentTime)<17) {
            comment = "오후에도 힘내세요";
        } else if (Integer.parseInt(currentTime)>=17 & Integer.parseInt(currentTime)<18) {
            comment = "집에 가기까지 얼마 안 남았습니다";
        } else if (Integer.parseInt(currentTime)>=18 & Integer.parseInt(currentTime)<21) {
            comment = "즐거운 저녁시간!";
        } else {
            comment = "슬슬 잘 시간이네요";
        }
        System.out.printf("%s\n", comment);
    }
}
// 자바 상수 = 정수, 실수, 문자, 문자열, 논리형
// 컴퓨터의 계산 상 논리연산자의 경우의 수는 3가지
/**
 * 변수: RAM에 저장됨
 * RAM은 휘발성 메모리이기 때문에 프로그램이 작동하는 중에만 유지되고 그 이후에는 사라짐
 * JAVA에서 변수는 가장 가까운 블록을 따라 생성되고, 블록이 종료되면 함께 사라짐
 * 기본 자료형은 소문자로, 참조 자료형은 대문자로 작성(ex - class)
 * 개발자로써 부동소수, 선형대수 등은 필수적으로 익혀두어야하는 개념
 * 32, 64bit 컴퓨터는 4byte int형을 기본형으로 받아들임
 * float = 소수점 8자리, double = 소수점 16자리
 * ASCII Code: 1바이트 / UNICODE: 2바이트
 * ASCII 코드에서는 ㄱ을 문자열로 인식하지만 UNICODE는 매핑 가능한 문자의 수가 더 크기 때문에 문자로 인식
 * ㅁㄴㅇㄹ */