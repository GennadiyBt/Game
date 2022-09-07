import java.util.List;

public class Monk extends BaseHero {
    public Monk(boolean team, int x, int y){
        super.setName("Monk");
        super.setAttak(12);
        super.setProtektion(7);
        super.setShots(0);
        super.setMaxShots(0);
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

    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub
        for (BaseHero hero : warriors) {
            if (hero.team==team && hero.getCrntHealth()<hero.getHealth() && hero.status != "Die") {
                hero.setCrntHealth(hero.getCrntHealth()-getDamageMin());
                hero.status += " Cured";
                break;
            }
        }

        
    }

    
}
