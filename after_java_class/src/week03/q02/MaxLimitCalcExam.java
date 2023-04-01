package week03.q02;

public class MaxLimitCalcExam {
    public static void main(String[] args) {
        MaxLimitCalc cal = new MaxLimitCalc();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}
