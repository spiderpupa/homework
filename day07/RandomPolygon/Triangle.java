package kr.ac.kopo.day07.RandomPolygon;

public class Triangle extends Polygon {
    double area = (height * width)/2;
    Triangle(int height, int width, double area){
        super(height, width, area);
        this.area = area;
    }

    void output(){
        System.out.printf("밑변의 길이가 %d, 높이가 %d인 삼각형의 크기는 %lf", width, height, area);
    }
}
