package week03.q06;

public class CalcExam {
    public static void main(String[] args) {
        Calc cal =new Calc();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
