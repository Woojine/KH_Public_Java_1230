package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 첫번째 배수에 대한 기본을 입력
// 연속으로 값 입력 받기 (ArrayList 입력 받은 값을 저장)
// 0 이면 종료
// 입력 받기를 종료한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
// 주어진 값이 3이면
// 99 is a multiple of 3
// 7 is Not a multiple of 3
public class MultipleGetEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하세요 : ");
        int val;
        int num = sc.nextInt();
        while (true) {
            val = sc.nextInt();
            if (val == 0) break;
            list.add(val);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % num == 0) System.out.println(list.get(i) + " is a multiple of " + num);
            else System.out.println(list.get(i) + " is Not a multiple of " + num);
        }
    }
}
