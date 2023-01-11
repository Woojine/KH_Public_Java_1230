package 아이패드만들기;

public class IPadMake {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            IPadPro iPad = new IPadPro("iPad Pro");
            if(!iPad.continueOrder()) break; //반환값이 false면 구매를 안함
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductionPad();
            iPad.viewProductPad();

        }

    }
}
