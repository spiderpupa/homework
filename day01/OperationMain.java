package kr.ac.kopo.day01;
public class OperationMain {
    public static void main(String[] args){
        int num=10;
        for(int i=0; i < 10; i++){ // i++은 단항연산, 오직 정수형 변수일 때만 1씩 더하는 연산 방식
            num+=1; // 복합대입연산자, 배정연산자
            System.out.print(num);
            if(i!=9){
                System.out.print(",");
            }
        }
        System.out.println();
        int a=1, b=-1, c=0;
        System.out.println(++a>0||b>0&&c>0);
    }
}