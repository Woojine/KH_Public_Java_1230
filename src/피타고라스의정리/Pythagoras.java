package 피타고라스의정리;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("삼각형 세변의 길이를 입력하세요 : ");
        int a, b, c;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) break;
            if (a * a + b * b == c * c) {
                System.out.println("right");
            }
            else if (a * a + c * c == b * b) {
                System.out.println("right");
            }
            else if (b * b + c * c == a * a) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}
