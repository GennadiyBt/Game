import java.util.ArrayList;
import java.util.List;

/**
 * game_main
 */
public class game_main {

    public static void main(String[] args) {
        
        List<Brigand> brigands = new ArrayList<>();
        List<Crossbowman> crossbowmans = new ArrayList<>();
        List<Monk> monks = new ArrayList<>();
        List<Peasant> peasants = new ArrayList<>();
        List<Sniper> snipers = new ArrayList<>();
        List<Sorcerer> sorcerers = new ArrayList<>();
        List<Spearman> spearmans = new ArrayList<>();
        int i = 1;
        while (i < 6) {
        
            brigands.add(new Brigand(String.format("Brigand %d", i)));
            crossbowmans.add(new Crossbowman(String.format("Crossbowman %d", i)));
            monks.add(new Monk(String.format("Monk %d", i)));
            peasants.add(new Peasant(String.format("Peasant %d", i)));
            snipers.add(new Sniper(String.format("Sniper %d", i)));
            sorcerers.add(new Sorcerer(String.format("Sorcerer %d", i)));
            spearmans.add(new Spearman(String.format("Spearman %d", i)));
            i++;
        }
     
        for (Brigand brigand : brigands) {
            System.out.println(brigand.info());
        } 
        System.out.println("");
        for (Crossbowman crossbowman : crossbowmans) {
            System.out.println(crossbowman.info());
        } 
        System.out.println("");
        for (Monk monk : monks) {
            System.out.println(monk.info());
        } 
        System.out.println("");
        for (Peasant peasant : peasants) {
            System.out.println(peasant.info());
        } 
        System.out.println("");
        for (Sniper sniper : snipers) {
            System.out.println(sniper.info());
        } 
        System.out.println("");
        for (Sorcerer sorcerer : sorcerers) {
            System.out.println(sorcerer.info());
        } 
        System.out.println("");
        for (Spearman spearman : spearmans) {
            System.out.println(spearman.info());
        } 
         
    }
}