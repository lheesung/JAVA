package week03.q03;

public class Calc extends week03.q01.Calc {
    public boolean odd(){
        if(getValue() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
