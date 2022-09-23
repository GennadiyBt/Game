package data;

public class Engine {
    private final String type;
    public String getType() {
        return type;
    }

    private final int volume;
    public int getVolume() {
        return volume;
    }

    private final float power;

    public float getPower() {
        return power;
    }

    public Engine(String type, int volume, float power){
        this.type = type;
        this.volume = volume;
        this.power = power;
    }

    public String infoEngine() {
        String eng = "Тип двигателя: " + type + ", объем: " + volume + ",  мощность: " + power;
        return eng;
    }



}
