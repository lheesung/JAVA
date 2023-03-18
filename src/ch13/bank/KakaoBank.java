package ch13.bank;

import ch13.Employee;

import java.util.HashMap;

public class KakaoBank implements Bank {
    private static KakaoBank instance = new KakaoBank();
    private static float rate;
    private static int money;
    private static int account;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    private KakaoBank(){
        rate = BankOfKorea.getInstance().getBaseRate() + 2.5f;
        account = 2000;
        money = 150000000;
    }

    public static KakaoBank getInstance() {
        if(instance == null){
            instance = new KakaoBank();
        }
        return instance;
    }
    @Override
    public int makeAccount() {
        return ++account;
    }

    @Override
    public void saving(int account, int money) {
        if(store.get(account)!=null) {
            money += store.get(account);
        }
        store.put(account, money);
    }

    @Override
    public int getAccount(int account) {
        return store.get(account);
    }

    @Override
    public int borrowMoney(Employee employee, int money) {
        if(employee.getGrade() > 3){
            System.out.println("신용등급이 3등급 이하만 대출");
            return 0;
        }
        if(this.money < money){
            System.out.println("은행 자본금이 부족함");
            return 0;
        }
        this.money -= money;
        System.out.println("우리 카카오 뱅크에서" + money + "원을 대출합니다.\n금리는 " + rate + "%입니다.\n"+"연가 이자는 " + money*rate/100 + "입니다.");
        return money;
    }

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        KakaoBank.rate = rate + 2.5f;
    }
}
