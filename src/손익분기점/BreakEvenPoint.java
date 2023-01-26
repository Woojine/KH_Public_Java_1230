package 손익분기점;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int valA = sc.nextInt(); // 고정비용
        int valB = sc.nextInt(); // 가변비용
        int valC = sc.nextInt(); // 총 비용
        int sum = 0;
        if(valB >= valC) {
            System.out.println("-1");
        }
        System.out.println((valA /(valC-valB))+1);
    }
}
