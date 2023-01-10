package 클래스기본;
// 클래스 이름은대문자로 시작하는 것이 관례


public class BasicClass {
    public static void main(String[] args) {
        Car car = new Car("g80");
        System.out.println(car.carName);
        Car santafe = new Car("싼타페");
        System.out.println(santafe.carName);

    }
}

// 필드 : 클래스에 포함된 변수를 의미
// 클래스 변수
// 인스턴스 변수
// 지역 변수
class Car {
    static String Manufacturer = "현대자동차"; //클래스 변수
    String carName = "G80"; // 인스턴수 변수

    Car(String name) {
        carName = name;
    }

    void corInfo() {
        int testVal = 10; // 지역 변수
    }
}

