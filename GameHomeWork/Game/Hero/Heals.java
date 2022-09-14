package Hero;

import java.util.List;

public abstract class Heals extends BaseHero {
    
    @Override
    public void step(List<BaseHero> warriors) {
        // TODO Auto-generated method stub 
        for (BaseHero hero : warriors) {
            if (hero.team==team && hero.getCrntHealth()<hero.getHealth() && hero.status != "Die") {
                hero.setCrntHealth(hero.getCrntHealth()-getDamageMin());
                break;
            }
        }
    }
}
