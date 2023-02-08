package 람다예제2번;
// 매개변수가 있는 람다식
@FunctionalInterface // 함수형 인터페이스 문법 체크를 위한 어노테이션
interface MyFuncInterface {
    public void method(int x);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);
    }
}
