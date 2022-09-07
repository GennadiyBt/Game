import java.util.List;

public abstract class BaseHero implements Action{
    private String name;
    private int attack;
    private int protection;
    private int maxShots;
    private int shots;
    private int damage_min;
    private int damage_max;
    private int health;
    private int crntHealth;
    private int speed;
    private int delivery;
    private int magic;
    protected String status;
    protected Plase position;
    protected boolean team; // Опознаватель свой - чужой

    protected BaseHero() {}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAttak(){return attack;}
    public void setAttak(int attack){this.attack = attack;}

    public int getProtektion(){return protection;}
    public void setProtektion(int protection){this.protection = protection;}

    public int getShots(){return shots;}
    public void setShots(int shots){
        if (shots > maxShots) {
            this.shots = maxShots;
        } else {
            this.shots = shots;
        }
    }

    public int getMaxShots(){return maxShots;}
    public void setMaxShots(int maxShots){this.maxShots = maxShots;}

    public int getDamageMin(){return damage_min;}
    public void setDamageMin(int damage_min){this.damage_min = damage_min;}

    public int getDamageMax(){return damage_max;}
    public void setDamageMax(int damage_max){this.damage_max = damage_max;}

    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}

    public int getCrntHealth(){return crntHealth;}
    public void setCrntHealth(int crnHealth){
        if (crnHealth > health) {
            this.crntHealth = health;
        }
        else {this.crntHealth = crnHealth;}
    }

    public int getSpeed(){return speed;}
    public void setSpeed(int speed){this.speed = speed;}

    public int getDelivery(){return delivery;}
    public void setDelivery(int delivery){this.delivery = delivery;}

    public int getMagic(){return magic;}
    public void setMagic(int magic){this.magic = magic;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}


    public void info() {
        System.out.println(String.format("%s, выстрелы: %d, здоровье: %d, статус: %s", 
        name, shots, crntHealth, status));
    }

    @Override
    public void step(List<BaseHero> warriors) {
        
        
        }

}
