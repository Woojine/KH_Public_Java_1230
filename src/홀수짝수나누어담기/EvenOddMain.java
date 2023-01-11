package 홀수짝수나누어담기;
// 7개의 정수를 입력받아 홀수와 짝수를 각각의 배열에 나누어 담기
// 7개의 정수를 입력받는 메소드
// 메소드를 홀수와 짝수로 나누어 담는 메소드
// 세번째는 메소드 결과를 출력하는 메소드
public class EvenOddMain {
    public static void main(String[] args) {
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.inputValue();
        evenOddArray.seperateValue();
        evenOddArray.displayValue();


    }
}
