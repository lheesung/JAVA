package ch03;

public class BreakExam {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.printf(i + "\t");
            if(i==5) break;
        }
    }
}
