package 암호체크;

import java.util.Scanner;

// 암호체크
// 암호의 길이는 10 ~ 30자 사이 ( 10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수 문자는 (!, %,_, #, &, - , * , /)의 9개중 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password"
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력한면 프로그램 종료
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("암호를 입력하세요 : ");
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd;
        while (true) {
            pwd = sc.next();
            if (pwd.equals("종료") || (pwd.equalsIgnoreCase("exit"))) break;
            if (!pwdCheck.validlength(pwd)) {
                System.out.println("Bad Length password!!");
                continue;
            }
            if (!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad Number password!!");
                continue;
            }
            if (!pwdCheck.validUpper(pwd)) {
                System.out.println("Bad Upper password!!");
                continue;
            }
            if (!pwdCheck.validLower(pwd)) {
                System.out.println("Bad Lower password!!");
                continue;
            }
            if (!pwdCheck.validRex(pwd)) {
                System.out.println("Bad specialLetter password!!");
                continue;

            }
            System.out.println("Good password");

        }
    }
}
