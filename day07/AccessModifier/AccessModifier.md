# 접근제한자와 형변환
<div style="text-align: right"> 2022/12/28 </div></br>
## 접근제한자
- public: 모든 위치에서 접근 가능
- protected: 같은 패키지 내에서만 접근 가능. 단 다른 패키지의 클래스와 상속관계에 있을 시 접근 가능
- default: 같은 패키지에서만 접근이 허용, 접근제한자가 선언되지 않았을 경우 기본 적용
- private: 자신의 클래스에서만 접근 허용
    - method의 접근자는 public, 멤버변수는 private로 작성하는 경우가 많음


- 클래스(외부) 사용 가능: public, default
- 내부클래스, 멤버변수, 메소드 사용 가능: 4가지 모두 가능

## 형변환
> 묵시적 형변환과 명시적 형변환

### 객체의 형변환
1. 정의: "=" 연산자를 기준으로 좌변과 우변의 데이터 타입이 다른 경우에 발생
2. 조건: 좌변과 우변의 객체가 **상속 관계**에 있어야 함


- 묵시적 형변환의 예
```agsl
public class Printer{}
public class LGPrinter{}
Printer p = new LGPrinter();

>>> Error 발생
------------------------------------------------------------
public class Printer{}
public class LGPrinter{} extends Printer{}
Printer p = new LGPrinter();

>>> 정상 작동
```
```agsl
class Parent{
    int A;
    int B;
}

class Child extends Parent{
    int C;
}
//                                    ⋯<중략>⋯
    Child c = new Child();
    Parent p = new Child();                                   
//                                    ⋯<후략>⋯                                    
```
> 자녀 클래스인 c는 A, B, C에 다 접근할 수 있지만 부모 클래스인 p는 C에 접근할 수 없음 

![override](https://user-images.githubusercontent.com/101073973/209766683-0d25ab01-13fd-4c7c-9714-370dcb44c1a9.png)
- @Override: 자식 클래스가 부모클래스와 같은 이름의 메소드를 가지고 있을 때 재정의하는 것
  * 다형성, 묵시적 변환이 쓰이는 이유. 명시적 형변환은 묵시적 형변환이 이미 발생한 경우 사용
  * 명시적 형변환은 부모 클래스에서 자식 클래스를 참조하고 싶을 때 주로 사용
  * 묵시적 형변환은 obj를 받아올 수 없음
  * 메소드에서 받아오는 경우가 많다