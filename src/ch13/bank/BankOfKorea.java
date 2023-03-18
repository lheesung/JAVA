package ch13.bank;

public class BankOfKorea {
    // 싱글톤 패턴
    private static BankOfKorea instance = new BankOfKorea(); // class 영역에 미리 공간할
    private float baseRate;
    public BankOfKorea(){

    }
    public static BankOfKorea getInstance(){
        if(instance == null){
            instance = new BankOfKorea();
        }
        return instance;
    }

    public static void setInstance(BankOfKorea instance) {
        BankOfKorea.instance = instance;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
        WooriBank.setRate(baseRate);
        KakaoBank.setRate(baseRate);
    }
}
