package 조건문1;

import java.util.Scanner;

// if(조건식) {조건식이 참인 경우 수행 됨}
public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키 입력 받기 위해 스캐너 객체 생성
        System.out.print("문자를 입력 하세요 :");
        char ch = sc.next().charAt(0); //입력받은 문자열에서 첫번째 문자를 추출
        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자 입니다");
        }else if(ch>='A' && ch <= 'Z'){
            System.out.println(ch +"대문자 입니다");
        }else {
            System.out.println("알파벳이 아닙니다");

        }
    }
}
