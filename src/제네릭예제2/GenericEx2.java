package 제네릭예제2;

public class GenericEx2 {
    public static void main(String[] args) {
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2023);

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(2024);
    }
}
