public class Sorcerer extends BaseHero {
    public Sorcerer(){
        super.setName("Sorcerer");
        super.setAttak(17);
        super.setProtektion(12);
        super.setShots(0);
        super.setDamageMin(-5);
        super.setDamageMax(-5);
        super.setHealth(30);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(1);
    }

    public Sorcerer(String name){
        super.setName(name);
        super.setAttak(17);
        super.setProtektion(12);
        super.setShots(0);
        super.setDamageMin(-5);
        super.setDamageMax(-5);
        super.setHealth(30);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(1);
    }
}
