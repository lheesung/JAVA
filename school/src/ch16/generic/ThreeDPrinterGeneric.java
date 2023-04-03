package ch16.generic;

public class ThreeDPrinterGeneric<T> {
    private T material;

    public void setMeterial(T meterial) {
        this.material = meterial;
    }

    public T getMeterial() {
        return material;
    }

    @Override
    public String toString() {
        return "3d 프린터의 재료는 " + material + "입니다.";
    }
}
