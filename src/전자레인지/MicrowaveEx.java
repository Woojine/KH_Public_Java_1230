package 전자레인지;

import java.util.Scanner;

// 3개의 시간조절용 버튼 A, B, C
// A버튼 : 5분, B버튼 : 1분 , C버튼: 10초 단위로 시간을 설정 가능
// 요리시간 100초 : B버튼 1회, C버튼 4회) => T 014
// 단 시간은 10초단위로 입력가능
public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        int T = sc.nextInt();
        int A= 0;
        int B =0;
        int C =0;
        if(T >= 300) {
            A = T/300;
            T -= A*300;
        }
        else if(T>=60) {
            B = T/60;
            T -= B*60;
        }
        else if(!(T%10==0)){
            System.out.print("-1");
            return;
        }
        else C = T/10;

        System.out.print("T"+A+B+C);


    }
}
