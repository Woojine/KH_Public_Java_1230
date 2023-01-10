package StringKMP;
//입력 : Knuth-Morris-Pratt
//출력 : KMP
//입력 : Mirko-Slavko
//출력 : MS

import java.util.Scanner;

public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 하세요 : ");
        String str = sc.next();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                System.out.print((char) ch);
             else System.out.print("");

            }
        }
    }
