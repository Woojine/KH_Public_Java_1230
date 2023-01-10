package StringKMP;

import java.util.Scanner;

public class StringKmp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();
        String[] result = str.split("-");
        for(int i = 0; i <str.length(); i++){
            System.out.print(result[i].substring(0,1));
        }
    }
}
