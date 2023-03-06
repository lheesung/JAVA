package ch02;

public class SwitchExam {
    public static void main(String[] args) {
        int month = 2;
        int days = 0;
        switch (month){
            case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 29;
        }
        System.out.println(days);
    }
}
