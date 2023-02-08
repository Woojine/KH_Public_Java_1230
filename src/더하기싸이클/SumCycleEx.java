package 더하기싸이클;

import java.util.Scanner;

public class SumCycleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 더하는 수
        int newNumber = 0; // 새로 만들어지는 수
        int cnt = 0;
        System.out.print("입력 : ");
        int input =sc.nextInt();
        int num = input;
        while(true) {
            sumNumber = (num / 10) + (num % 10);
            newNumber = ((num % 10) * 10) + (sumNumber % 10);
            cnt++;
            if(num == newNumber) break;
            num = newNumber;
        }
        System.out.println(cnt);
    }
}

