package Hero;


public class Monk extends Heals {
    public Monk(boolean team, int x, int y){
        super.setName("Monk");
        super.setAttak(12);
        super.setProtektion(7);
        super.setDamageMin(-4);
        super.setDamageMax(-4);
        super.setHealth(30);
        super.setCrntHealth(30);
        super.setSpeed(5);
        super.setDelivery(0);
        super.setMagic(1);
        this.team = team;
        position = new Plase(x, y);
        status = "Aktive";
    }

    

    
}
