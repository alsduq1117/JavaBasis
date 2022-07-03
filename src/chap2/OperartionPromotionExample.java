package chap2;

public class OperartionPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        int  intValue1 = byteValue1 + byteValue2;   //4byte 보다 작은 타입은 int 타입으로 변환된 후 연산이 수행된다.
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);

        int intValue5 = 10;
        double doubleValue = intValue5 / 4.0;  //double 타입으로 자동 타입 변환
        System.out.println(doubleValue);
    }
}
