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

    @Override
    public String getSpeed() {
        // TODO Auto-generated method stub
        return "Максимальная скорость " +base.getMax_speed()+ " км/ч, крейсерская скорость " + cruising_speed + " км/ч";
    }

    @Override
    public String getEnvironment() {
        // TODO Auto-generated method stub
        return "Воздушный транспорт";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + base.infoBase()+ engine.infoEngine() +
         " Максимальная высота полета: "+max_flight_altitude+ " Дальность полета: "+flight_range+ " Крейсерская скорость: "+cruising_speed;
        return info;
    }
    
}
