package PC방알바;

import java.util.Scanner;

// 피씨방에는 피씨가 100대
// 손님은 자신이 원하는 피씨를 사용하고 싶어함
// 손님의 수 입력 : 5
// 손님의 선택한 좌석 번호 : 1 1 3 3 5
// 출력 : 거절 횟수
public class PcRoomEx {
    public static void main(String[] args) {
        int[] seat = new int[100];
        Scanner sc =  new Scanner(System.in);
        System.out.print("손님의 수를 입력하세요 : ");
        int check = sc.nextInt(); // 손님의 수 입력
        int refuse = 0; //거절 횟수를 누적
        for(int i =0; i< check; i++) { //입력 받은 손님의 수 만큼 좌석 번호를 입력 받음
            int seatNum = sc.nextInt(); //각 손님의 좌석 번호를 입력 받음
            if (seat[seatNum-1] ==1) refuse++;
            else seat[seatNum - 1] = 1;

        }
        System.out.print(refuse);
    }
}
