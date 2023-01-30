package 제네릭;

import java.util.ArrayList;
import java.util.List;

// 제네릭이란? 데이터 타입을 일반화 즉, 데이터 형식에 의존하지 않고
// 하나의 값이 여러 데이터 타입을 가질 수 있도록 하는 방법
// -컴파일시 강한 타입 체크
// -타입 변환을 제거
// 제네릭 타입의 선언 public class 클래스명 <T>{....}
public class Generic {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("정우진");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(1000);
        System.out.println(p2.info);

    }
}
// 'T'는 타입 변수를 의미 하며, 이름은 T가 아니여도 되지만 일반적을 R를 많이씀
class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }

}
