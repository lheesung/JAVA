package week03.q02;

import week03.q01.Calc;

public class MaxLimitCalc extends Calc {
    @Override
    public void add(int i) {
        if (getValue() + i > 100) {
            System.out.println("결과값이 100 보다 큼.");
            setValue(100);
        } else {
            setValue(getValue() + i);
        }
    }
}
