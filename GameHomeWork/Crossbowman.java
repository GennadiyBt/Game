import java.util.List;

public class Crossbowman extends BaseHero {
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

    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
        for (BaseHero hero : warriors) {
            if (hero.team!=team && hero.status != "Die" && getShots() > 0) {
                hero.setCrntHealth(hero.getCrntHealth()-getDamageMin()); // С рассчетом повреждений пока не заморачиваемся
                setShots(getShots()-1);
                hero.status += " Wounded"; //Временное поле для отслеживания воздействия
                if (hero.getCrntHealth() <= 0) {hero.status = "Die";}
                break;
            }
        }
    }

}
