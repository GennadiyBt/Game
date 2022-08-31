public class Brigand extends BaseHero{
    public Brigand(){
        super.setName("Brigand");
        super.setAttak(8);
        super.setProtektion(3);
        super.setShots(0);
        super.setDamageMin(2);
        super.setDamageMax(4);
        super.setHealth(10);
        super.setSpeed(6);
        super.setDelivery(0);
        super.setMagic(0);
    }

    public Brigand(String name){
        super.setName(name);
        super.setAttak(8);
        super.setProtektion(3);
        super.setShots(0);
        super.setDamageMin(2);
        super.setDamageMax(4);
        super.setHealth(10);
        super.setSpeed(6);
        super.setDelivery(0);
        super.setMagic(0);
    }
}
