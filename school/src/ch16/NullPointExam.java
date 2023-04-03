package ch16;

public class NullPointExam {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException npe){
            System.out.println(npe); // log 남기기
        } finally {
            System.out.println("무조건 실행");
        }
    }
}
