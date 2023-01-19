package 자동차만들기;

public class SportsCar extends Car{
    public SportsCar(String name) {
        this.name = name;
        this.speed = 250;
        this.fuelval = 8;
        this.fueltank = 30;
        this.seat = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) speed *= 1.2;
    }
}
