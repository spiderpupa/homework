package kr.ac.kopo.day01;
public class VarMain {
    public static void main(String[] args){
//        정수 123을 저장하기 위한 변수 a 생성
        int a; // 선언 - 이 예제의 경우 메모리 상에 4바이트의 공간이 할당됨
        a=123; // 대입 - 자바에서는 쓰레기값을 출력하려고 하면 에러 발생(The local variable a may not have been initialized)
        int b=123; // 초기화(선언+대입)
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        double c = 12.34;
        int d = (int)c;
        System.out.println(d);
    }
}
/*
    변수선언 규칙
    자료형 변수명;
    boolean
    char
    byte
    short
    int
    long
    float
    double
    String(참조자료형으로 S 자체에는 문자열이 저장되지 않고 따로 heap에 저장,

   묵시적 형변환: 범위가 넓은 데이터형에 범위가 좁은 데이터형을 대입, 문법적으로는 오류가 없음
   명시적 형변환: 범위가 좁은 데이터형에 범위가 넓은 데이터형을 대입, 강제로 형변환해야함(생략 불가) ex) int a = (int)12.34;
*/