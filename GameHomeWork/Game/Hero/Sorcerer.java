package Hero;

public class Sorcerer extends Heals {
    public Sorcerer(boolean team, int x, int y){
        super.setName("Sorcerer");
        super.setAttak(17);
        super.setProtektion(12);
        super.setDamageMin(-5);
        super.setDamageMax(-5);
        super.setHealth(30);
        super.setCrntHealth(30);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(1);
        this.team = team;
        position = new Plase(x, y);
        status = "Aktive";
    }

}
