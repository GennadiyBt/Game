package data;

import Interfase.ViewInfo;

public abstract class Vehicle implements ViewInfo{
    
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

    @Override
    public String getSpeed() {
        // TODO Auto-generated method stub
        return Integer.toString(base.getMax_speed()) + " км/ч";
    }

    @Override
    public String getEnvironment() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model;
        return info;
    }

    
}
