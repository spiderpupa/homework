package kr.ac.kopo.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 문제 3
        // 아이스크림 총 구매 개수만큼 질문 반복, 아이스크림의 이름 및 가격 입력
        List<String> perchaseList = new ArrayList<String>(); // 아이스크림 리스트
        List<String > priceList = new ArrayList<String>();   // 가격 리스트

        System.out.print("총 몇 개의 아이스크림을 구매하시겠습니까? ");
        int total = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= total; i++){
            System.out.printf("*** %d번째 아이스크림 ***\n", i);
            System.out.print("아이스크림명 : ");
            String iceCream = scanner.nextLine();
            System.out.print("아이스크림가격 : ");
            String price = scanner.nextLine();
            perchaseList.add(iceCream);
            priceList.add(price);
        }

        System.out.printf("<총 %d개의 아이스크림 구매 정보 출력>\n", total);
        System.out.println("번호\t아이스크림명\t아이스크림가격");
        for(int j = 0; j <total; j++){
            System.out.printf("%d\t%-10s\t%7s\n",j+1 ,perchaseList.get(j) ,priceList.get(j));
        }



    }
}
