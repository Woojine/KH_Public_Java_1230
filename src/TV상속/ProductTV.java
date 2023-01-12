package TV상속;

public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternet;
    ProductTV() {
        super(true, 30,30);
        this.name = "LG Smart TV";
    }
    ProductTV(String name) {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
        this.isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower){
        this.isPower = isPower;
    }
    void setVolume(int volume){
        if(volume >=0 && volume<=100) this.volume = volume;
        else System.out.println("볼륨 설정 범위를 벗어 났습니다.");
    }
    @Override //오버라이딩 성립 여부를 컴파일러에게 확인하도록 요청
    // 오버라이딩: 부모가 물려준 특성을 재정의
    void setChannel(int cnl) {
        if(cnl > 0 && cnl < 2000) {
            channel = cnl;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
    void setChannel(int cnl, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        }else this.isInternet = false;
    }
    void viewTV(){
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}
