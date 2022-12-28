package kr.ac.kopo.day05;

import java.util.Scanner;

class SellIcecream {
   Icecream[] iceArr;

    void open() {
        Scanner sc = new Scanner(System.in);

        boolean timeOut = false;
//		while(!timeOut) {

        System.out.print("아이스크림 몇개 구매할래? ");
        int cnt = Integer.parseInt(sc.nextLine());
        iceArr = new Icecream[cnt];
        for(int i = 0; i < iceArr.length; i++) {
            System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
            System.out.print("아이스크림명 : ");
            String name = sc.nextLine();
            System.out.print("아이스크림 가격 : ");
            int price = sc.nextInt();
            sc.nextLine();
            iceArr[i] = new Icecream(name, price);
        }

        info();
//		}

    }

    void info() {

        System.out.println("< " + iceArr.length + "개 구매정보 출력 >");
        System.out.println("번호\t아이스크림명\t아이스크림가격");
        for(int i = 0; i < iceArr.length; i++) {
            System.out.println(i+1 + "\t" + iceArr[i].getName()
                    + "\t\t" + iceArr[i].getPrice());
        }
    }

    void close() {

    }
}

