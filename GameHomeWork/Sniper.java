import java.util.List;

public class Sniper extends BaseHero {
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
