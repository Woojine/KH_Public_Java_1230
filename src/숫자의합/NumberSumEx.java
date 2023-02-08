package 숫자의합;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백 없이 쓰여 있음, 이 숫자를 모두 합해서 출력
// 54321 => 15
// 7000000000000 => 7
// 5678 => 26
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String num;
        while (true) {
            int sum = 0;
            num = sc.next();
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            if (num.equals("0000")) break;
            System.out.println("출력 : " + sum);
        }

    }
}
