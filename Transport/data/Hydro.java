package data;

public abstract class Hydro extends Vehicle{
    protected final String body_type;
    protected final String body_material;
    protected final String dryve_type;

    public Hydro(Engine engine, Base base, String body_type, String body_material, String dryve_type){
        super(engine, base);
        this.body_type = body_type;
        this.body_material = body_material;
        this.dryve_type = dryve_type;
    }

    public Hydro(Engine engine, Base base, String brand, String model, String body_type, String body_material, String dryve_type){
        super(engine, base, brand, model);
        this.body_type = body_type;
        this.body_material = body_material;
        this.dryve_type = dryve_type;
    }
    
}
