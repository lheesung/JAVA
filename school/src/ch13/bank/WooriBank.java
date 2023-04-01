package ch13.bank;

import ch13.Employee;

import java.util.HashMap;

public class WooriBank implements Bank {
    private static WooriBank instance = new WooriBank();

    public static WooriBank getInstance() {
        if(instance == null)
            instance = new WooriBank();
        return instance;
    }
    private static float rate;
    private static int account;
    private static int money = 5000;
    private static HashMap<Integer, Integer> store = new HashMap<>();
    private WooriBank(){
        rate =BankOfKorea.getInstance().getBaseRate() + 2.0f;
        account = 1000;
        money = 100000000;
    }

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        WooriBank.rate = rate + 2.0f;
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
        System.out.println("우리 은행에서" + money + "원을 대출합니다.\n금리는 " + rate + "%입니다.\n"+"연가 이자는 " + money*rate/100 + "입니다.");
        return money;
    }
}
