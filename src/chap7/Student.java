package chap7;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name,ssn);          //부모 생성자에 기본생성자가 없으므로 매개변수가 있는 부모 생성자를 호출해야한다.
        this.studentNo = studentNo;
    }
}
