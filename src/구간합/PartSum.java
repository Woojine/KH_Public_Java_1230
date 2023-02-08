package 구간합;

import java.util.Scanner;

public class PartSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        System.out.print("테스트 케이스 개수를 입력하세요 : ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
      int left =0, right = 0;
        long sum =0;
        while(m != 0) {
            System.out.print("범위 입력 : ");
            left = sc.nextInt();
            right = sc.nextInt();
            for(int i = left - 1; i < right; i++) {
                sum += arr[i];
            }
            System.out.println("결과 : " + sum);
            sum = 0;
            m--;
        }
    }
}
