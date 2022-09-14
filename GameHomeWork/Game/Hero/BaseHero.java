package Hero;

import Interface.*;

import java.util.List;

public abstract class BaseHero implements Action{
    private String name;
    private int attack;
    private int protection;
    private int damage_min;
    private int damage_max;
    private int health;
    private int crntHealth;
    private int maxShots;
    private int shots;
    private int speed;
    private int delivery;
    private int magic;
    protected String status;
    protected Plase position;
    protected boolean team;

    protected BaseHero() {}

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

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAttak(){return attack;}
    public void setAttak(int attack){this.attack = attack;}

    public int getProtektion(){return protection;}
    public void setProtektion(int protection){this.protection = protection;}


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
        System.out.println(String.format("%s, здоровье: %d, статус: %s, позиция: x %d, y %d", 
        name, crntHealth, status, position.x, position.y));
    }

    public void step(List<BaseHero> warriors) {
        
    }

    public Boolean getTeam(){return team;}

    public Plase getDistance(List <BaseHero> warriors){
        int dist = Integer.MAX_VALUE;
        int out = 0;
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).team!=team && !warriors.get(i).status.equals("Die")){
                int dX = Math.abs((warriors.get(i).position.x - position.x));
                int dY = Math.abs(warriors.get(i).position.y - position.y);
                int tD = dX + dY;
                if (dist > tD) {
                    out = i;
                    dist = tD;
                }
            }
        }
        return new Plase(out, dist);
    }

    public void go(List <BaseHero> warriors){
        if (position.x > warriors.get(getDistance(warriors).x).position.x) {
            position.x--;
        }
        else if  (position.x < warriors.get(getDistance(warriors).x).position.x) {
            position.x++;
        }
        else if  (position.y > warriors.get(getDistance(warriors).x).position.y) {
            position.y--;
        }
        else if (position.y < warriors.get(getDistance(warriors).x).position.y){
            position.y++;
        }
    }

}
