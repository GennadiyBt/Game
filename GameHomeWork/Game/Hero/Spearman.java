package Hero;
public class Spearman extends Mili {
    public Spearman(boolean team, int x, int y){
        super.setName("Spearman");
        super.setAttak(4);
        super.setProtektion(5);
        super.setDamageMin(1);
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
