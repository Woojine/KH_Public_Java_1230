package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name = "정우진";
        String addr = "경기도 수원시";
        char gender = '남';
        int age = 25;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        // 자바 스타일(print() /println()  메소드 오버로딩
        System.out.println("========Java Style========");
        System.out.println("이름 :" + name);
        System.out.println("주소 :" + addr);
        System.out.println("성별 :" + gender);
        System.out.println("나이 :" + age);
        System.out.println("총점 :" + (kor+eng+mat));
        System.out.println("평균:" + ((double)(kor+eng+mat)/3));

        //c언어 스타일 (서식 지정자와 이스케이프 시퀀스 사용)


    }
}
