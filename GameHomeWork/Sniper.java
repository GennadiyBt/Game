public class Sniper extends BaseHero {
    public Sniper(){
        super.setName("Sniper");
        super.setAttak(12);
        super.setProtektion(10);
        super.setShots(32);
        super.setDamageMin(8);
        super.setDamageMax(10);
        super.setHealth(15);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(0);
    }

    public Sniper(String name){
        super.setName(name);
        super.setAttak(12);
        super.setProtektion(10);
        super.setShots(32);
        super.setDamageMin(8);
        super.setDamageMax(10);
        super.setHealth(15);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(0);
    }
}
