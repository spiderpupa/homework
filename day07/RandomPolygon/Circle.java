package kr.ac.kopo.day07.RandomPolygon;

public class Circle extends Shape {
    private int radius;
    private final double PI = 3.141592;
    double area = radius * radius * 3.14;
    public Circle(int radius){
        this.radius = radius;
        this.area =area;
        this.radius = radius;
    }
    @Override
    void output () {
        System.out.printf("반지름의 길이가 %d인 원의 크기는 %f", radius, area);
    }
}
