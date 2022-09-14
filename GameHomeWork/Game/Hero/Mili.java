package Hero;

import java.util.List;

public abstract class Mili extends BaseHero{
    
    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
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
