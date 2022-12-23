package kr.ac.kopo.day04;

import java.text.DecimalFormat;

public class CarMain {
    public static void main(String[] args){
        Car matiz = new Car();
        matiz.model="matiz";
        matiz.price=15000000;

        Car morning = new Car();
        morning.model="morning";
        morning.price=15000000;

        System.out.println(matiz);
        System.out.println(morning);

        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("모델명: "+matiz.model+"\t가격: "+df.format(matiz.price)+"원");
    }
}
