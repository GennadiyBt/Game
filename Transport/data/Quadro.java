package data;

public class Quadro extends Car{
    
    public Quadro(Engine engine, Base base, int numWheels, String drive, int numDoors){
        super(engine, base, numWheels, drive, numDoors);
        this.numDoors = 0;
    }

    public Quadro(Engine engine, Base base, String brand, String model, int numWheels, String drive, int numDoors){
        super(engine, base, model, brand, numWheels, drive, numDoors);
        this.numDoors = 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + " "+ base.infoBase()+ " "+ engine.infoEngine() +
         " Число колес: "+ numWheels + " Привод: "+ drive;
        return info;
    }
}
