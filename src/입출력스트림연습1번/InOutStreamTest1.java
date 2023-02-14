package 입출력스트림연습1번;

import org.jetbrains.annotations.NotNull;
import 더하기싸이클.SumCycleEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
// 파일을 만들고 특정 위치에 저장
// FileInputStream을 이용해서 파일에 대한 스트림 생성
// 파일의 내용은 스캐너를 사용해서 읽어 들이고
// 성적은 Integer.parseInt()를 이용해 변환
// 학생과 성적을 입력 받을 클래스를 만들고 split() 생성된 문자열을 클래스 부터 생성된 객체에 저장
// 클래스를 만들 때 정렬 위해서 Comparable 이나 comparator 상속 받아 정렬 조건 구현
// TreeSet 컬랙션 사용

public class InOutStreamTest1 {
    public static void main(String[] args) {
        TreeSet<Score> ts = new TreeSet<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력스트림연습1번/score.txt");
        } catch( FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            String name = arr[0];
            int kor = Integer.parseInt(arr[1]);
            int eng = Integer.parseInt(arr[2]);
            int mat = Integer.parseInt(arr[3]);
            ts.add(new Score(name, kor, eng, mat));
        }
     for(Score e : ts) {
            System.out.println(e.name + ": " + e.getSum());
        }

    }
}class Score implements Comparable<Score>{
        String name;
        int kor;
        int eng;
        int mat;

        public Score(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    public int getSum() {
        return kor + eng + mat;
    }

    @Override
    public int compareTo(Score o) {
        if(this.getSum() == o.getSum()) return this.name.compareTo(o.name);
        else if(this.getSum() < o.getSum()) return 1;
        else return -1;
        }
    }

