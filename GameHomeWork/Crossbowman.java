public class Crossbowman extends BaseHero {
    public Crossbowman(){
        super.setName("Crossbowman");
        super.setAttak(6);
        super.setProtektion(3);
        super.setShots(16);
        super.setDamageMin(2);
        super.setDamageMax(3);
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(0);
        super.setMagic(0);
    }

    public Crossbowman(String name){
        super.setName(name);
        super.setAttak(6);
        super.setProtektion(3);
        super.setShots(16);
        super.setDamageMin(2);
        super.setDamageMax(3);
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(0);
        super.setMagic(0);
    }
}
