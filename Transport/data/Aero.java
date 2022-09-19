package data;

public abstract class Aero extends Vehicle{
    protected final int max_flight_altitude;
    protected final int flight_range;
    protected final int cruising_speed;

    public Aero(Engine engine, Base base, int max_flight_altitude, int flight_range, int cruising_speed){
        super(engine, base);
        this.max_flight_altitude = max_flight_altitude;
        this.flight_range = flight_range;
        this.cruising_speed = cruising_speed;
    }

    public Aero(Engine engine, Base base, String brand, String model, int max_flight_altitude, int flight_range, int cruising_speed){
        super(engine, base, brand, model);
        this.max_flight_altitude = max_flight_altitude;
        this.flight_range = flight_range;
        this.cruising_speed = cruising_speed;
    }
    
}
