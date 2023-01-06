package 최대값최소값구하기;

import java.util.Scanner;

// 정수를 입력 받음 ( 배열의 갯수)
// 입력 받은 정수의 크기 만큼의 배열 생성
// 배열의 크기 만큼 순회하면서 임의의 정수 값 입력
// 입력 받은 배열에서 최소값과 최대값 출력
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성
        System.out.print("배열의 크기를 입력하세요 : "); //정수값 입력 받기
        int num = sc.nextInt(); //정수값 입력 받기
        int[] val = new int[num]; //입력 받은 정수값으로 배열 생성
        for( int i =0; i < val.length; i++){
            val[i] = sc.nextInt();
        } /*for(int e : val) {
        if(max <e) max = e;
        if(min >e) min = e;
         */
        int max = val[0]; //배열의 첫번째값 대입
        int min = val[0]; //배열의 첫번째값 대입
        for(int i = 0; i < val.length; i++) { //생성된 배열의 크기만큼 순회하면서 임의 정수 입력 받음
            if(max < val[i])   max = val[i];
            if(min > val[i])   min = val[i];
        }
        System.out.println("최대값은 " + max +"입니다");
        System.out.println("최소값은 " + min +"입니다");

    }
}
