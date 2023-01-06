package 요금제계산하기;

import java.util.Scanner;

// 영식 요금제 : 30초마다 10원씩 청구 (30초 미만이면 1통, 30초 이상 2통 ~~)
// 민식 요금제 : 60초마다 15원씩 청구 (60초 미만이면 1통, 60초 이상 2통 ~~)
// 통화 횟수 : 3
// 통화 시간 : 40 70 45
// 둘 중 싼 요금제 이름을 표시하고 통 요금 계산 ( 영식 요금제 : 총 통화 금액)
// 총 통화 금액이 같으면 ( 영식/민식 요금제 : 총 통화 금액)
public class MobilePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 입력 : ");
        int pay = sc.nextInt(20);
        System.out.print("통화 시간 입력 :");
        int y = 0;
        int m = 0;
        int sec = 0;
        for(int i = 0; i < pay; i++){
            sec = sc.nextInt();
            y += (sec/30)*10 + 10;
            m += (sec/60)*15 + 15;

        }
        if(y == m) {
            System.out.print("영식/민식 요금제 " + y);
        }
        else if(y > m){
            System.out.print("민식 요금제 " + y);
        }
        else if(m > y){
            System.out.print("영식 요금제 " + m);
        }

    }
}
