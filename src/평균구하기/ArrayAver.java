package 평균구하기;

import java.util.Scanner;

// 5명의 학생이 시험을 치는데 시험 점수가 40점 미만이면 보충수업으로 듣는 조건으로 점수를 40으로 수정
//모든 학생이 40점 미만인 경우 보충 수업을 듣기로함
//모든 학생의 성적에 대한 평균을 구하기
public class ArrayAver {
    public static void main(String[] args) {
        int[] score = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < score.length; i ++){
            score[i] = sc.nextInt();
            if( score[i] < 40) score[i] = 40 ; // 입력받은 성적이 40 미만이면 40으로 바꿈
            sum += score[i];
        }
        System.out.printf("평균 : %.2f\n",(double)sum/score.length);

    }
}
