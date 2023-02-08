package 소수;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 문자를 입력하세요 : ");
        String word = sc.next();
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                total += (int) ch - 96;
            } else if (ch >= 'A' && ch <= 'z') {
                total += (int) ch - 38;
            }
        }
        boolean isPrime = true;
        for(int i = 2; i < total; i++) {
            if (total % i == 0) isPrime = false;
        }
            if(isPrime) System.out.println("It is a prime word");
            else System.out.println("It is not a prime word");
    }
}

