package 가장큰수출력;

import java.util.Scanner;

// 세자리 정수를 입력 받아 가장 큰 수 출력
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요 :");
        int a,b,c;
        int number = sc.nextInt();
        a = (number/100);
        b = (number%100) / 10;
        c = (number % 10);
        if ( a> b && a> c) {
            System.out.println("가장 큰 수는" + a);
        } else if (b>a && b>c){
                System.out.println("가장 큰 수는" + b);
            }
            else { System.out.println("가장 큰 수는 " + c);

        }

    }
}
