package 중복된배열;

import java.util.Scanner;

// 10개의 배열을 만들고 임의의 숫자를 입력 받음(가급적 중복된 숫자가 있도록 입력(1,2,3,4,5,6,1,3,4,5))
// 중복된 문자 중 두번째 나오는 숫자의 위치 찾기( 위치는 인덱스가 아니고 실질적인 위치)
// 임의의 수 10개 입력
// 찾을 숫자 : 5 찾는 수가 없으면 -1
// 결과 : 10
public class DuplicateArray {
    public static void main(String[] args) {
        int[] Arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개를 입력 하세요 : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.print("찾을 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == num) {
                cnt++;
                if (cnt == 2) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
            if (cnt < 2) System.out.println("-2");



    }
}
