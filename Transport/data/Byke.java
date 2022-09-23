package data;

public class Byke extends Land{
    private final String frame;

    public Byke(Engine engine, Base base, String brand, String model, int numWheels, String frame){
        super(engine, base, brand, model, numWheels);
        this.frame = frame;
    }

    public Byke(Engine engine, Base base, int numWheels, String frame){
        super(engine, base, numWheels);
        this.frame = frame;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String info = "Марка: "+ brand +" Модель: "+ model + " "+ base.infoBase()+ " "+ engine.infoEngine() +
         " Число колес: "+ numWheels + " Тип рамы: "+ frame;
        return info;
    }

}
