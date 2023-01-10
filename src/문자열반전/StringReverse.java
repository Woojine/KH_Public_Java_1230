package 문자열반전;

import java.util.Scanner;

//abcdefg => gfedcba
//입력 받은 문자열을 역순으로 출력
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 :");
        String str = sc.next();

        for( int i =str.length()-1; i>=0; i--)
        System.out.print(str.charAt(i));

    }
}
