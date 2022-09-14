package Hero;

public class Crossbowman extends Shooting {
    public Crossbowman(boolean team, int x, int y){
        super.setName("Crossbowman");
        super.setAttak(6);
        super.setProtektion(3);
        super.setMaxShots(16);
        super.setShots(16);
        super.setDamageMin(2);
        super.setDamageMax(3);
        super.setHealth(10);
        super.setCrntHealth(10);
        super.setSpeed(4);
        super.setDelivery(0);
        super.setMagic(0);
        this.team = team;
        position = new Plase(x, y);
        status = "Aktive";
    }

}
