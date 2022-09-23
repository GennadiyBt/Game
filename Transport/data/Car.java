package data;

public class Car extends Land {
    protected final String drive;
    protected int numDoors;

    public Car(Engine engine, Base base, int numWheels, String drive, int numDoors){
        super(engine, base, numWheels);
        this.drive = drive;
        this.numDoors = numDoors;
    }

    public Car(Engine engine, Base base, String brand, String model, int numWheels, String drive, int numDoors){
        super(engine, base, brand, model, numWheels);
        this.drive = drive;
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + " "+ base.infoBase()+ " "+ engine.infoEngine() +
         " Число колес: "+ numWheels + " Привод: "+ drive + " Количество дверей: "+numDoors;
        return info;
    }

}
