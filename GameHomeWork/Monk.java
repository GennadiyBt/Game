public class Monk extends BaseHero {
    public Monk(){
        super.setName("Monk");
        super.setAttak(12);
        super.setProtektion(7);
        super.setShots(0);
        super.setDamageMin(-4);
        super.setDamageMax(-4);
        super.setHealth(30);
        super.setSpeed(5);
        super.setDelivery(0);
        super.setMagic(1);
    }

    public Monk(String name){
        super.setName(name);
        super.setAttak(12);
        super.setProtektion(7);
        super.setShots(0);
        super.setDamageMin(-4);
        super.setDamageMax(-4);
        super.setHealth(30);
        super.setSpeed(5);
        super.setDelivery(0);
        super.setMagic(1);
    }
}
