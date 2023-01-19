package 자동차만들기;

public class Sedan extends Car{

    public Sedan(String name) {
        this.name = name;
        this.speed = 200;
        this.fuelval = 12;
        this.fueltank = 45;
        this.seat = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seat += 1;

    }
}
