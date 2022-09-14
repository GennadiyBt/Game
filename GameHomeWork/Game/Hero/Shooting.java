package Hero;

import java.util.List;

public abstract class Shooting extends BaseHero{
    
    @Override
    public void info() {
        System.out.println(String.format("%s, выстрелы: %d, здоровье: %d, статус: %s", 
        getName(), getShots(), getCrntHealth(), status));
    }

    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
            if (warriors.get(getDistance(warriors).x).team!=team && getShots() > 0) {
                warriors.get(getDistance(warriors).x).setCrntHealth(warriors.get(getDistance(warriors).x).getCrntHealth()-damage(warriors));
                setShots(getShots()-1);
                if (warriors.get(getDistance(warriors).x).getCrntHealth() <= 0) {warriors.get(getDistance(warriors).x).status = "Die";}
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
        if (getDistance(warriors).y>12) {result = Math.round(result/3);}
        else if (getDistance(warriors).y>6) {result = Math.round(result*2/3);}
        return result;
    }
}
