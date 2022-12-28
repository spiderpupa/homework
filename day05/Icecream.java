package kr.ac.kopo.day05;

public class Icecream {
        String name; // 아이스크림 이름
        int price; // 아이스크림 가격
        static int icecreamCnt; // 아이스크림 개수
        static int icecreamTotal; // 아이스크림 총 가격

        Icecream(String name, int price){
            this.name = name;
            this.price = price;

            Icecream.icecreamCnt++;
            Icecream.icecreamTotal+=price;
        }

        String getName(){
            return this.name;
        }

        int getPrice(){
            return this.price;
        }

        void Info(){
            System.out.println("총 판매량: "+icecreamCnt+"EA, 총 판매액: "+icecreamTotal);
        }
}
