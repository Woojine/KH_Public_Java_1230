package 홀수짝수나누어담기;

import java.util.Scanner;

public class EvenOddArray {
    int[] inputArray = new int[7];
    int[] evenArray = new int[7];
    int[] oddArray = new int[7];
    int evenIdx, oddIdx = 0; //짝수,홀수에 대한 인덱스 계산

    void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 7개를 입력하세요 : ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }
    }

    void seperateValue() {
        for (int i = 0; i < 7; i++) {
            if (inputArray[i] % 2 == 0) evenArray[evenIdx++] = inputArray[i];
            else oddArray[oddIdx++] = inputArray[i];
        }
    }

    void displayValue() {
        System.out.println("홀수 : ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        System.out.println("짝수 : ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
