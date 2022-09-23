import java.util.ArrayList;

import data.*;



public class main {
    
    public static void main(String[] args) {
        ArrayList <Vehicle> dataArray = Init.init();
        for (Vehicle element : dataArray) {
            System.out.println(element.toString());
            System.out.println(element.getSpeed());
            System.out.println(element.getEnvironment());
            System.out.println();
        }


    }
}
