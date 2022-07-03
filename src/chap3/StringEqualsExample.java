package chap3;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "김민엽";
        String strVar2 = "김민엽";
        String strVar3 = new String("김민엽");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);   //다른 객체의 번지값이므로 false
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }
}
