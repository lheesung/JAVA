package ch16.package2;

public class Powder implements Material {
    @Override
    public String toString() {
        return "재료는 powder 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더로 출력할거임");
    }
}
