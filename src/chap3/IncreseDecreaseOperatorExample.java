package chap3;

public class IncreseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("-------------------------------");
        x++;  //x=11
        ++x;  //x=12
        System.out.println("x="+x);  //x=12

        System.out.println("--------------------------------");
        y--;  //y=9
        --y;  //y=8
        System.out.println("y="+y);  //y=8

        System.out.println("--------------------------------");
        z = x++;  // z = x 한 뒤에 x + 1  z=12 , x=13
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-------------------------------- ");
        z = ++x;   // x+1 한 뒤에 z = x   z=14  x=14
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-------------------------------- ");
        z = ++x + y++;  // x+1 -> x+y -> y+1 -> z=x+y    x=15 z=15+8 y=9
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
