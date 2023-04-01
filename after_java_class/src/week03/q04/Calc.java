package week03.q04;

public class Calc extends week03.q01.Calc {
    public int avg(int i[]){
        int sum = 0;
        for (int j : i) {
            sum += j;
        }
        return sum / i.length;
    }
}