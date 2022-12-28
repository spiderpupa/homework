package kr.ac.kopo.day07.RandomPolygon;
import java.util.Random;
/** 랜덤하게 1~4 사이의 값을 추출
 * 도형의 넓이를 출력하는 프로그램을 만든다
 * 삼각형, 정사각형, 직사각형, 원
 * 도형 선택
 * 추출된 정수
 * 추출된 정수 2, 4인 경우 2-10 사이의 정수를 하나만 추출하여 정사각형 또는 원의 넓이를 출력
 * 추출된 정수가 1, 3인 경우 2-10 사이의 정수를 2개 추출, 삼각형 또는 정사각형의 밑변과 높이 적용 후 출력 */
public class RandomPolygonMain{
    public static void main(String[] args) {
        System.out.println("<임의의 도형 넓이 출력>");
        Random r = new Random();
        int random = r.nextInt(1,4);  //0+1 ~3+1
        int height = r.nextInt(2,10);
        int width = r.nextInt(2,10);
        int radius = r.nextInt(2,10);

        Triangle t = new Triangle(height, width);
        Square s = new Square(height, width);
        Rectangle re = new Rectangle(height, width);
        Circle c = new Circle(radius);

        if(random == 1){
            t.output();
        } else if (random == 2) {
            s.output();
        } else if (random == 3) {
            re.output();
        } else if (random == 4){
            c.output();
        }
    }
}
