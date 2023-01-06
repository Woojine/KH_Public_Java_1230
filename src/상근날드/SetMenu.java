package 상근날드;

import java.util.Scanner;

// 상근날드에 3가지 햄버거와 2가지 음료
// 3가지 햄버거의 가격 중 가장 싼 메뉴의 가격을 선택하고, 음료 중 가장 싼 메뉴의 가격을 선택
//세트 메뉴는 50원 할인됨
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[5];
        for(int i = 0; i < 5; i++) {
            menu[i] = sc.nextInt();
        }
        int burger = menu[0];
        int drink = menu[3];
        /*{
        if((i <3) && (burger > menu[i])) burger = menu[i]
        if((i >2) && (drink > menu[i])) drink = menu[i]        */
        for( int i = 0; i <3; i ++){
            if(burger> menu[i]) burger = menu[i];
        }
        for(int i =3; i <5; i++){
            if(drink> menu[i]) drink = menu[i];
        }
        System.out.println("세트의 가격은 : " +(burger+drink-50));
    }
}
