package chap6;

public class Earth {
    static final double EARTH_RADIUS = 6400;   //static final 은 상수를 선언 할때 사용 final 은 객체마다 값이 달라질수 있으므로 상수가 아님.
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
