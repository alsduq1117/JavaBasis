package chap4;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outer: for(char upper='A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g'){
                    break Outer;
                }
            }
        }
    }
}
