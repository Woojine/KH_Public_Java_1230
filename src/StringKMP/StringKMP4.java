package StringKMP;

import java.util.Scanner;

// 문자 배열로 변경후 출력
public class StringKMP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str =sc.next();
        char[] chName = str.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e<= 'Z') System.out.print(e);

        }
    }
}
