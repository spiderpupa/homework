package kr.ac.kopo.day07.RandomPolygon;

public class Square extends Rectangle {
    double area = height*height;

    @Override
    Square(int height, int width){
        super(height, width);
        this.area = area;
    }

    void output () {System.out.printf("세로변의 길이가 %d, 가로변의 길이가 %d인 직사각형의 크기는 %d", height, width, area);
    }
}
