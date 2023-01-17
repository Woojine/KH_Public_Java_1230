package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        BackClass kakao = new BackClass("카카오", 1000);
        BackClass shinHan = new BackClass("신한", 1000);
        BackClass nh = new BackClass("농협", 0);
        kakao.setDeposit(12000);
        kakao.setWithdraw(5000);
        kakao.viewAccount();
        System.out.println(BackClass.getCnt());

        System.out.println(Util.getCurrentDate("yyyy년MM월dd일 hh:mm:ss"));
    }
}
