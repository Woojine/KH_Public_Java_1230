package 자동차만들기;

public class Bus extends Car{
    public Bus(String name) {
        this.name = name;
        this.speed = 5;
        this.fuelval = 150;
        this.fueltank = 100;
        this.seat = 20;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) fueltank +=30;
    }
}
