package data;

public abstract class Vehicle {
    
    protected final Engine engine;
    protected final Base base;
    protected final String brand;
    protected final String model;

    public Vehicle(Engine engine, Base base){
        this.engine = engine;
        this.base = base;
        brand = "None";
        model = "None";
    }

    public Vehicle(Engine engine, Base base, String brand, String model){
        this.engine = engine;
        this.base = base;
        this.brand = brand;
        this.model = model;
    }

    
}
