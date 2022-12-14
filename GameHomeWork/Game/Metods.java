import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Hero.*;

public abstract class Metods {
    public Metods() {
    }
   
    public static List<BaseHero> init() {
        
        List<BaseHero> warriors = new ArrayList<BaseHero>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(7)){
                case 0:
                    warriors.add(new Peasant(true, 0,i));
                    break;
                case 1:
                    warriors.add(new Brigand(true, 0,i));
                    break;
                case 2:
                    warriors.add(new Sniper(true, 0,i));
                    break;
                case 3:
                    warriors.add(new Monk(true, 0,i));
                    break;
                case 4:
                    warriors.add(new Sorcerer(true, 0,i));
                    break;
                case 5:
                    warriors.add(new Spearman(true, 0,i));
                    break;
                default:
                    warriors.add(new Crossbowman(true, 0,i));
            }
        }
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(7)){
                case 0:
                    warriors.add(new Peasant(false, 9,i));
                    break;
                case 1:
                    warriors.add(new Brigand(false, 9,i));
                    break;
                case 2:
                    warriors.add(new Sniper(false, 9,i));
                    break;
                    case 3:
                    warriors.add(new Monk(false, 9,i));
                    break;
                case 4:
                    warriors.add(new Sorcerer(false, 9,i));
                    break;
                case 5:
                    warriors.add(new Spearman(false, 9,i));
                    break;
                default:
                    warriors.add(new Crossbowman(false, 9,i));
            }
        }
        return warriors;
    }

    public static void battle(List<BaseHero> warriors){
        int step = 1;
        if (step == 1) {
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Team 1");
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).getTeam()) {
                warriors.get(i).info();
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Team 2");
        for (int i = 0; i < warriors.size(); i++) {
            if (!warriors.get(i).getTeam()) {
                warriors.get(i).info();
            }
        }
        Scanner in = new Scanner(System.in);
        boolean gameOver = true;
        while (gameOver) {
            step++;
            String txt = in.nextLine();
            if (txt.equals("")) { 
                for (BaseHero hero : warriors) {
                    if (hero.getStatus() != "Die") {hero.step(warriors);}
                }  
                
                System.out.println("");
                System.out.println("Step " + step);
                System.out.println("Team 1");
                for (int i = 0; i < warriors.size(); i++) {
                    if (warriors.get(i).getTeam()) {
                        warriors.get(i).info();
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("--------------------------------------------");
                System.out.println("Team 2");
                for (int i = 0; i < warriors.size(); i++) {
                    if (!warriors.get(i).getTeam()) {
                        warriors.get(i).info();
                    }
                }
            }
            if (txt.equals("quit")) {
                break;
            }
            gameOver = allDie(warriors);
        }
    }

    public static boolean allDie(List<BaseHero> warriors) {
        boolean victory1 = true;
        boolean victory2 = true;
        boolean result = true;
        for (BaseHero hero : warriors) {
            if (hero.getTeam() && hero.getStatus() == "Aktive") {
                victory1 = false;
            }
        }

        for (BaseHero hero : warriors) {
            if (!hero.getTeam() && hero.getStatus() == "Aktive") {
                victory2 = false;
            }    
        }

        if (victory1 || victory2 ) {
            result = false;
            System.out.println("GAME OVER");
        }
        return result;
        
    }

    public static void button() {
        battle(init());   
    }
}
