package data;

public class Helicopter extends Aero {
    private final int screw_diameter;

    public Helicopter(Engine engine, Base base, int max_flight_altitude, 
                    int flight_range, int cruising_speed, int screw_diameter){
        super(engine, base, max_flight_altitude, flight_range, cruising_speed);
        this.screw_diameter = screw_diameter;
    }

    public Helicopter(Engine engine, Base base, String brand, String model, int max_flight_altitude, 
                    int flight_range, int cruising_speed, int screw_diameter){
        super(engine, base, brand, model, max_flight_altitude, flight_range, cruising_speed);
        this.screw_diameter = screw_diameter;               
        }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + " "+ base.infoBase()+ " "+ engine.infoEngine() +
         " Максимальная высота полета: "+max_flight_altitude+ " Дальность полета: "+flight_range+ " Крейсерская скорость: "+cruising_speed+
         "Диаметр винта: " + screw_diameter;
        return info;
    }
}
