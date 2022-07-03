package chap3;

public class BitShiftExample {
    public static void main(String[] args) {
        System.out.println("1<<3 = " + (1<<3));  // 왼쪽으로 3비트 빈자리는 0
        System.out.println("-8>>3 =" + (-8>>3));  // 오른쪽으로 3비트 빈자리는 최상위 비트
        System.out.println("-8>>>3 = " + (-8>>>3)); //오른쪽으로 3비트 빈자리는 0
    }
}
