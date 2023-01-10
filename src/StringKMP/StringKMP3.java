package StringKMP;

import java.util.Scanner;
// 0번째 문자를 출력하고, '-'이후 문잘르 출력
public class StringKMP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();
        for( int i = 0; i < str.length(); i++){
            if(i ==0) System.out.print(str.charAt(0));
            else { // 하이픈 문자를 만나면 하이픈 다음에 오는 문자를 출력
                if(str.charAt(i) == '-') System.out.print(str.charAt(i+1));
            }
        }
    }
}
