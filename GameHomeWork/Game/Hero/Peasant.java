package Hero;

import java.util.List;

public class Peasant extends BaseHero {
    public Peasant(boolean team, int x, int y){
        super.setName("Peasant");
        super.setAttak(1);
        super.setProtektion(1);
        super.setDamageMin(1);
        super.setDamageMax(1);
        super.setHealth(1);
        super.setCrntHealth(1);
        super.setSpeed(3);
        super.setDelivery(1);
        super.setMagic(0);
        this.team = team;
        position = new Plase(x, y);
        status = "Aktive";
    }

    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
        for (BaseHero hero : warriors) {
            if (hero.team==team && hero.getMaxShots()>0 && hero.getShots()<hero.getMaxShots() && hero.status != "Die") {
                hero.setShots(hero.getShots()+1);
                setDelivery(0);
                break;
            }    
        }
        if (getDelivery()>0){
            int steps = getSpeed();
        while (steps > 0){
            if (getDistance(warriors).y == 1){
                warriors.get(getDistance(warriors).x).setCrntHealth(warriors.get(getDistance(warriors).x).getCrntHealth()-damage(warriors));
                if (warriors.get(getDistance(warriors).x).getCrntHealth() <= 0) {warriors.get(getDistance(warriors).x).status = "Die";}
                break;
            }
            else {
                go(warriors);
                steps--;
            }
        }
        }
    }

    public int damage(List <BaseHero> warriors){
        int result;
        if (getAttak()>warriors.get(getDistance(warriors).x).getProtektion()){
            result = getDamageMax();
        }
        else if (getAttak()==warriors.get(getDistance(warriors).x).getProtektion()){
            result = Math.round((getDamageMax()+getDamageMin())/2);
        }
        else {result = getDamageMin();}
        return result;
    }

}
