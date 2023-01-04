package 알람설정하기;

import java.util.Scanner;

// 알람 설정시 자동으로 설정 시간보다 45분 일찍 되도록 설정함
// 입력 시간을 시간과 분으로 입력 받기
// 입력 받은 시간에서 45분을 당기기
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력:");
        int hour = sc.nextInt();
        System.out.print("분 입력:");
        int min = sc.nextInt();
        int calc = (hour*60) + min;
        if(calc < 45) {//45보다 작으면 전날로 돌아가는 경우만 생각
            calc = (24*60) + min;
        }
        calc -= 45;//그게 아닐경우 그냥 45분만 빼주고 계산
        System.out.printf("%d시%s분\n",(calc/60), (calc % 60));


    }
}
