package kr.ac.kopo.day04;

public class MethodMain01 {
    /** 메소드 설명
     * 메소드는 문장들의 집합
     *
     */
    static int printStar(int data){ // void는 소문자로 시작
        int a = 1;
        System.out.println("*****************");
        System.out.println("data: " + data);
        return a;
    }
    public static void main(String[] args) {
        String[] str = {"Hello","Hi","Good-bye"};
        for(int i = 0; i < str.length; i++){
            printStar(10);
            System.out.println(str[i]);
        }

    }
}
