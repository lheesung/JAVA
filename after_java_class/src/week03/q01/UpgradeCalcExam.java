package week03.q01;

public class UpgradeCalcExam {
    public static void main(String[] args) {
        UpgradeCalc cal =new UpgradeCalc();
        cal.add(10);
        cal.minus(7);
        System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력
    }
}
