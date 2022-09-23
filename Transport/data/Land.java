package data;

public abstract class Land extends Vehicle {
    protected final int numWheels;
    

    public Land(Engine engine, Base base, String brand, String model, int numWheels){
        super(engine, base, brand, model);
        this.numWheels = numWheels;
    }

    public Land(Engine engine, Base base, int numWheels){
        super(engine, base);
        this.numWheels = numWheels;
    }
    
    @Override
    public String getEnvironment() {
        // TODO Auto-generated method stub
        return "Наземный транспорт";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + base.infoBase()+ engine.infoEngine() +
         " Число колес: " + numWheels;
        return info;
    }

}
