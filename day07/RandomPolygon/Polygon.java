package kr.ac.kopo.day07.RandomPolygon;
public class Polygon extends Shape{
    int width;
    int height;

    Polygon(int width, int height, double area){
        super(area);
        this.width = width;
        this.height = height;
    }
}