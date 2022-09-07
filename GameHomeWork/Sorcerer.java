import java.util.List;

public class Sorcerer extends BaseHero {
    public Sorcerer(boolean team, int x, int y){
        super.setName("Sorcerer");
        super.setAttak(17);
        super.setProtektion(12);
        super.setShots(0);
        super.setMaxShots(0);
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
    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
        for (BaseHero hero : warriors) {
            if (hero.team==team && hero.getCrntHealth()<hero.getHealth() && hero.status != "Die") {
                hero.setCrntHealth(hero.getCrntHealth()-getDamageMin());
                hero.status += " Cured"; //Временное поле для отслеживания воздействия
                break;
            }
        }
    }

}
