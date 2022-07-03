package chap3;

public class SignOperationExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        short s =100;
        int result3= -s; // - 부호 연산자는 int타입으로 변환된다.
        System.out.println("result3=" + result3);

    }
}
