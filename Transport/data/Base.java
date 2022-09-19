package data;

public class Base {
    private final int max_speed;
    public int getMax_speed() {
        return max_speed;
    }

    private final int seats;
    public int getSeats() {
        return seats;
    }

    private final int full_mass;
    public int getFull_mass() {
        return full_mass;
    }

    private final int length;
    public int getLength() {
        return length;
    }

    private final int width;
    public int getWidth() {
        return width;
    }

    private final int height;
    public int getHeight() {
        return height;
    }

    private final int volume_tank;

    public int getVolume_tank() {
        return volume_tank;
    }

    public Base(int max_speed, int seats, int full_mass, int length, int width, int height, int volume_tank){
        this.max_speed = max_speed;
        this.seats = seats;
        this.full_mass = full_mass;
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume_tank = volume_tank;
    }
}
