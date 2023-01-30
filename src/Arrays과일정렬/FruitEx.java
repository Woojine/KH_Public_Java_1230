package Arrays과일정렬;
// Arrays sort() : Comparator 사용하기
// 정렬은 기본적으로 오름 차순 정렬
// 임의의 10개 과일이름 배열 생성, 길이순으로 정렬하고 만약 길이가 같으면 사전순으로 정렬
// 문자열 길이를 비교하기 : length()
// compareTo() : 문자열을 ASC 코드값으로 비교해 결과를 양수/0/음스로 반환
// 반환값이 양수이면 정렬 조건이 되고 음수이면 현 상태 유진의 조건

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class FruitEx {
    public static void main(String[] args) {
        // 문자열 배열을 만들어 과일이름을 10개 생성
        String[] fruits = {"apple", "banana", "kiwi", "melon", "grape", "orange", "peach", "strawberry", "mango", "lime"};

        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길기 때문에 정렬 조건에 해당
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 첫번째보다 두번째가 사전 순서
                    }
                    return -1; //정렬하지 않는 조건
                }
            }
        });
        System.out.println(Arrays.toString(fruits));
    }
}
