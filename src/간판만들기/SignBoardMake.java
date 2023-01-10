package 간판만들기;

import java.util.Scanner;

//임의의 숫자를 입력 받음 : 120
//120에 대해서 차지하는 공간을 계산
//0은 4칸,1 은 2칸, 나머지는 3칸
//120 => 1+2+1+3+1+4+1 =12
//0 입력되기 전까지는 반복 수행
public class SignBoardMake {
    public static void main(String[] args) {
        int [] numSize = {4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        String number = "";
        int sum = 0; //입력된 숫자에 총 자릿수
        while(true) {
            number = sc.next();
            if(number.equals("0")) break;
            for(int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i)-'0'] +1; //각 숫자의 뒤의 여백을 계산

            }
            System.out.println(sum + 1); // 숫자 맨앞의 여백을 계산하기 위해서
            sum = 0;
        }
    }
}
