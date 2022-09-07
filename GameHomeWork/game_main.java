import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * game_main
 */
public class game_main {

    public static void main(String[] args) {
        
        int step = 1;
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
        if (step == 1) {
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Team 1");
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).team) {
                warriors.get(i).info();
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Team 2");
        for (int i = 0; i < warriors.size(); i++) {
            if (!warriors.get(i).team) {
                warriors.get(i).info();
            }
        }
        Scanner in = new Scanner(System.in);
        while (true) {
            step++;
            String txt = in.nextLine();
            if (txt.equals("")) {  // Надоело каждый ход next писать. Теперь просто нажатие Enter.
                for (BaseHero hero : warriors) {
                    if (hero.status != "Die") {hero.step(warriors);}    
                }
                //warriors.forEach(hero -> hero.step(warriors));
                System.out.println("");
                System.out.println("Step " + step);
                System.out.println("Team 1");
                for (int i = 0; i < warriors.size(); i++) {
                    if (warriors.get(i).team) {
                        warriors.get(i).info();
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("--------------------------------------------");
                System.out.println("Team 2");
                for (int i = 0; i < warriors.size(); i++) {
                    if (!warriors.get(i).team) {
                        warriors.get(i).info();
                    }
                }
            }
            if (txt.equals("quit")) {
                break;
            }
        }
        
         
    }
}