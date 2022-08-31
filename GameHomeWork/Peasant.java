public class Peasant extends BaseHero {
    public Peasant(){
        super.setName("Peasant");
        super.setAttak(1);
        super.setProtektion(1);
        super.setShots(0);
        super.setDamageMin(1);
        super.setDamageMax(1);
        super.setHealth(1);
        super.setSpeed(3);
        super.setDelivery(1);
        super.setMagic(0);
    }

    public Peasant(String name){
        super.setName(name);
        super.setAttak(1);
        super.setProtektion(1);
        super.setShots(0);
        super.setDamageMin(1);
        super.setDamageMax(1);
        super.setHealth(1);
        super.setSpeed(3);
        super.setDelivery(1);
        super.setMagic(0);
    }
}
