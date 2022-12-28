package kr.ac.kopo.day07.Icecream;
import java.text.DecimalFormat;
public class Icecream {
    String name;        // 아이스크림 상표명
    int price;          // 아이스크림 가격
    String manufacture;  //아이스크림 제조사

    Icecream(String name, int price, String manufacture){
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
    }

    void info(){
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("상품명: " + name + "\t가격: " + price + "\t제조사: " + manufacture);
    }
}
