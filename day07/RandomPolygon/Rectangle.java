package kr.ac.kopo.day07.RandomPolygon;

public class Rectangle extends Polygon {
    double area = height*width;
    Rectangle(int width, int height, double area){
        super(width, height, area);
        this.area = area;
    }
    void output(){
        System.out.printf("한 변의 길이가 %d인 정사각형의 크기는 %d", height, area);
    }
}
