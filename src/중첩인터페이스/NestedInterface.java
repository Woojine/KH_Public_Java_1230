package 중첩인터페이스;
// 중첩인터페이스는 클래스 내부에 선언한 인터페이스
// 중첩인터페이스는 주로 UI 프로그래밍에서 사용
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnclickListener(new CallListener());
        button.touch();
        button.setOnclickListener(new MessageListener());
        button.touch();
    }
}
