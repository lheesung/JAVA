package ch13;

import ch13.bank.BankOfKorea;
import ch13.bank.KakaoBank;
import ch13.bank.WooriBank;

public class BankExam {
    public static void main(String[] args) {
        // 1. 기준 금리 설정
        BankOfKorea backOfKorea = BankOfKorea.getInstance();
        backOfKorea.setBaseRate(3.5f);
        System.out.println(backOfKorea.getBaseRate());
        System.out.println(WooriBank.getRate());
        System.out.println(KakaoBank.getRate());
        // 2. 근로자는 은행별 계좌 생성
        WooriBank wooriBank = WooriBank.getInstance();
        KakaoBank kakaoBank = KakaoBank.getInstance();
        Employee choi = new Employee("choi", 1);
        choi.setWooriAccount(wooriBank.makeAccount());
        choi.setKakaoAccount(kakaoBank.makeAccount());
        System.out.println(choi.getWooriAccount());
        System.out.println(choi.getKakoAccount());
        // 3. 저금하기
        choi.saving(wooriBank, 10000);
        choi.saving(kakaoBank, 5000);
        choi.showMoney(wooriBank);
        choi.showMoney(kakaoBank);

        choi.borrowMoney(wooriBank, 10000);
        choi.showMoney(wooriBank);
        System.out.println(choi.getGrade());
    }
}
