package 저항값계산;
// 3개의 컬러를 입력 받음( 문자열로)
// 첫번째 컬러: 10의 자리수

import java.util.Scanner;

public class ColorEx {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", " yellow", "green",
        "blue", "violet", "grey", "white"};
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        Scanner sc = new Scanner(System.in);
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();
        for(int i = 0; i < color.length; i++) {
            if(color1.equals(color[i])) val1 = i;
            if(color2.equals(color[i])) val2 = i;
            if(color3.equals(color[i])) val3 = i;
        }
        System.out.println((long)((val1*10)+val2)* (long)Math.pow(10,val3));

    }
}
