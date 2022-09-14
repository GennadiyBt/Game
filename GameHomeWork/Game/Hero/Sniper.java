package Hero;

public class Sniper extends Shooting {
    public Sniper(boolean team, int x, int y){
        super.setName("Sniper");
        super.setAttak(12);
        super.setProtektion(10);
        super.setMaxShots(32);
        super.setShots(32);
        super.setDamageMin(8);
        super.setDamageMax(10);
        super.setHealth(15);
        super.setCrntHealth(15);
        super.setSpeed(9);
        super.setDelivery(0);
        super.setMagic(0);
        this.team = team;
        position = new Plase(x, y);
        status = "Aktive";
    }

}
