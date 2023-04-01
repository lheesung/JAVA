package ch13;

import ch13.bank.KakaoBank;
import ch13.bank.WooriBank;

public class Employee {

    private String name;
    private int kakaoAccount;
    private int wooriAccount;
    private int grade;

    public int getKakaoAccount() {
        return kakaoAccount;
    }
    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setWooriAccount(int makeAccount) {
        this.wooriAccount = makeAccount;
    }

    public void setKakaoAccount(int makeAccount) {
        this.kakaoAccount = makeAccount;
    }

    public void saving(Object obj, int money) { // Object: 모든 클래스의 최상위 클래스
        if(obj instanceof KakaoBank){
            ((KakaoBank) obj).saving(kakaoAccount, money);
        } else if (obj instanceof WooriBank) {
            ((WooriBank) obj).saving(wooriAccount, money);
        }
    }

    // create account
    public int getWooriAccount(){
        return wooriAccount;
    }
    public int getKakoAccount(){
        return kakaoAccount;
    }

    public void showMoney(Object obj) {
        if(obj instanceof WooriBank){
            System.out.println("현재" + name + "의 "+ wooriAccount + "계좌에는 " + ((WooriBank) obj).getAccount(wooriAccount) + "원 이 있음");
        } else if (obj instanceof KakaoBank) {
            System.out.println("현재" + name + "의 "+ kakaoAccount + "계좌에는 " + ((KakaoBank) obj).getAccount(kakaoAccount) + "원 이 있음");
        }
    }
    public void borrowMoney(Object obj, int money) {
        if(obj instanceof WooriBank){
            int borrow = ((WooriBank) obj).borrowMoney(this,money);
            ((WooriBank) obj).saving(wooriAccount, borrow);
        } else if (obj instanceof KakaoBank){
            int borrow = ((KakaoBank) obj).borrowMoney(this, money);
            ((KakaoBank) obj).saving(kakaoAccount, borrow);
        }
    }
    public int getGrade() {
        return grade;
    }
}
