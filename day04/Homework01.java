package kr.ac.kopo.day04;

import java.util.Scanner;
import java.util.*;
public class Homework01 {
    public static void main(String[] args) {
        // 문제 1, 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요");
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
            while(num1 < 0 || num1 >=100){
                System.out.print("0이상 100 미만의 정수를 입력해주세요\nnum1: ");
                num1 = scanner.nextInt();
            }
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
            while(num2 < 0 || num2 >=100) {
                System.out.print("0이상 100 미만의 정수를 입력해주세요\nnum2: ");
                num2 = scanner.nextInt();
            }
        System.out.print("num3: ");
        int num3 = scanner.nextInt();
            while(num3 < 0 || num3 >=100) {
                System.out.print("0이상 100 미만의 정수를 입력해주세요\nnum3: ");
                num3 = scanner.nextInt();
            }
        System.out.print("num4: ");
        int num4 = scanner.nextInt();
            while(num4 < 0 || num4 >=100) {
                System.out.print("0이상 100 미만의 정수를 입력해주세요\nnum4: ");
                num4 = scanner.nextInt();
            }
        System.out.print("num5: ");
        int num5 = scanner.nextInt();
                while(num5 < 0 || num5 >=100) {
                    System.out.print("0이상 100 미만의 정수를 입력해주세요\nnum5: ");
                    num5 = scanner.nextInt();
                }

        System.out.printf("< PRINT >\n%d %d %d %d %d\n\n", num1, num2, num3, num4, num5);

        int[] numArr = {num1, num2, num3, num4, num5};
        System.out.println("< REVERSE >");
        for(int i = 0; i < numArr.length; i++){
            String str = String.format("%02d", numArr[i]);
            StringBuffer n1 = new StringBuffer(str);
            String reverse = n1.reverse().toString();
            System.out.print(reverse+" ");
        }
        System.out.println();
        scanner.close();
    }
}