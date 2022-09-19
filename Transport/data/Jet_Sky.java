package data;

public class Jet_Sky extends Hydro{
    protected final String siting_type;

    public Jet_Sky(Engine engine, Base base, String body_type, String body_material, String dryve_type, String siting_type){
        super(engine, base, body_type, body_material, dryve_type);
        this.siting_type = siting_type;
    }

    public Jet_Sky(Engine engine, Base base, String brand, String model, String body_type, 
                    String body_material, String dryve_type, String siting_type){
        super(engine, base, brand, model, body_type, body_material, dryve_type);
        this.siting_type = siting_type;
                    }
    
}
