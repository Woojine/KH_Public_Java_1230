package 문자열추가;
//2개의 문자열을 입력 받고, 정수 n값을 입력 받음
//첫번째 문자열 입력 : seoul
//두번째 문자열 입력 : korea
//정수값 입력 : 2
//첫번째 문자열의 뒤 부분의 n개의 문자를 두번째 문자열 앞에 끼워 놓는 코드 작성

import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력하세요 :");
        String str1 = sc.next();
        System.out.print("두번째 문자열을 입력하세요 :");
        String str2 = sc.next();
        System.out.print("정수 n을 입력하세요 :");
        int n = sc.nextInt();
        int pos =str1.length()-1;
        String str = str1.substring(pos);
        System.out.println(str+str2);
    }
}
