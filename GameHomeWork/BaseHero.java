public abstract class BaseHero implements Action{
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int damage_min;
    private int damage_max;
    private int health;
    private int speed;
    private int delivery;
    private int magic;
    private boolean status;
    private int[] position;
    // private boolean team; // Опознаватель свой - чужой

    protected BaseHero() {}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAttak(){return attack;}
    public void setAttak(int attack){this.attack = attack;}

    public int getProtektion(){return protection;}
    public void setProtektion(int protection){this.protection = protection;}

    public int getShots(){return shots;}
    public void setShots(int shots){this.shots = shots;}

    public int getDamageMin(){return damage_min;}
    public void setDamageMin(int damage_min){this.damage_min = damage_min;}

    public int getDamageMax(){return damage_max;}
    public void setDamageMax(int damage_max){this.damage_max = damage_max;}

    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}

    public int getSpeed(){return speed;}
    public void setSpeed(int speed){this.speed = speed;}

    public int getDelivery(){return delivery;}
    public void setDelivery(int delivery){this.delivery = delivery;}

    public int getMagic(){return magic;}
    public void setMagic(int magic){this.magic = magic;}

    public boolean getStatus(){return status;}
    public void setStatus(boolean status){this.status = status;}

    public int[] getPosition(){return position;}
    public void setPosition(int[] position){this.position = position;}

    public String info() {
        return String.format("Класс: %s, имя: %s, атака: %d, защита: %d, выстрелы: %d, урон минимальный: %d, урон максимальный: %d, здоровье: %d, скорость: %d, доставка: %d, магия: %d", this.getClass(), 
        name, attack, protection, shots, damage_min, damage_max, health, speed, delivery, magic);
    }
    @Override
    public int blow() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHit(int damage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[] changePositions(int[] position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void returnCondition() {
        // TODO Auto-generated method stub
        
    }

}
