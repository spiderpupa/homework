package kr.ac.kopo.day04;
class HandPhone{
    String name;
    String phone;
    String company;
}
public class HandPhoneMain {
    public static void main(String[] args) {
        HandPhone hp01 = new HandPhone();
        hp01.name="윤길동";
        hp01.phone="010-2222-3333";
        hp01.company="모토로라";

        HandPhone hp02 = new HandPhone();
        hp02.name="홍길동";
        hp02.phone="010-1111-2222";
        hp02.company="삼성";

        HandPhone hp03 = new HandPhone();
        hp03.name="강길동";
        hp03.phone = "010-1234-5678";
        hp03.company = "애플";

        HandPhone[] hpArr = {hp01, hp02, hp03};
        for(int i = 0; i < hpArr.length; i++){
            System.out.println("소유자명: " + hpArr[i].name +
                                "\t연락처: " + hpArr[i].phone +
                                "\t제조사: " + hpArr[i].company);
        }
    }
}
