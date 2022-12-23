package kr.ac.kopo.day01;
import java.util.Scanner;
public class MeasureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정수 입력
        System.out.print("첫 번째 정수를 입력하세요:");
        int first = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요:");
        int second = scanner.nextInt();
        while (second == 0) {
            System.out.println("0은 입력할 수 없습니다. 두 번째 정수를 입력하세요");
            second = scanner.nextInt();
        }
        if (first % second == 0) {
            System.out.printf("%d는 %d의 약수입니다\n", first, second);
        } else {
            System.out.printf("%d는 %d의 약수가 아닙니다\n", first, second);
        }
        // 반복 여부
        System.out.println("계속하시겠습니까?: Y: 네 | N: 아니오");
        char answer = scanner.nextLine().charAt(0);
        while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
            System.out.println("잘못된 문자를 입력했습니다.\n계속하시겠습니까?: Y: 네 | N: 아니오");
            answer = scanner.nextLine().charAt(0);
        }
    }
}
