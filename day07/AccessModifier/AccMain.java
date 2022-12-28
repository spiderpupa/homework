package kr.ac.kopo.day07.AccessModifier;
class A{
    void info(){
        System.out.println();
    }
}

class B extends A{
    void info(){
        System.out.println();
    }
}

class C extends A{
    void info(){
        System.out.println();
    }
}

class D extends A{
    void info(){
        System.out.println();
    }
}

class Test{
    void method(A obj){
        obj.info();
    }
}
public class AccMain {
    public static void main(String[] args) {
        Test t = new Test();
        t.method(new D());   
        /** 다형성, 묵시적 변환이 쓰이는 이유. 명시적 형변환은 묵시적 형변환이 이미 발생한 경우 사용
         * 명시적 형변환은 부모 클래스에서 자식 클래스를 참조하고 싶을 때 주로 사용
         * 묵시적 형변환은 obj를 받아올 수 없음 */
    }
}
