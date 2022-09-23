import java.util.ArrayList;

import data.*;

public class Init {

    public static ArrayList init(){
        ArrayList<Vehicle> test = new ArrayList<Vehicle>();
        Engine bmw_g310r_e = new Engine("бензиновый", 313, 34);
        Base bmw_g310r_b = new Base(143, 2, 164, 2005, 500, 1000, 11);
        Byke bmw_g310r = new Byke(bmw_g310r_e, bmw_g310r_b, "BMV", "G 310 R", 2, "каркасная");
        test.add(bmw_g310r);

        Engine kawasaki_e = new Engine("бензиновый", 399, 45);
        Base kawasaki_b = new Base(188, 2, 168, 1990, 710, 1120, 14);
        Byke kawasaki = new Byke(kawasaki_e, kawasaki_b, "Kavasaki", "Ninja 400", 2, "trellis");
        test.add(kawasaki);

        Engine ford_fiesta_e = new Engine("бензиновый", 1596, 105);
        Base ford_fiesta_b = new Base(182, 5, 1520, 3969, 1722, 1495, 42);
        Car ford_fiesta = new Car(ford_fiesta_e, ford_fiesta_b, "Ford", "Fiesta", 4, "передний", 5);
        test.add(ford_fiesta);

        Engine infiniti_e = new Engine("бензиновый", 1997, 252);
        Base infiniti_b = new Base(200, 7, 2160, 5127, 1960, 1767, 70);
        Car infiniti = new Car(infiniti_e, infiniti_b, "Infiniti", "QX60", 4, "полный", 5);
        test.add(infiniti);

        Engine rm_800_e = new Engine("бензиновый", 800, 60);
        Base rm_800_b = new Base(100, 2, 398, 2340, 1210, 1480, 24);
        Quadro rm_800 = new Quadro(rm_800_e, rm_800_b, "RM", "800 DUO", 4, "полный", 0);
        test.add(rm_800);

        Engine yamaha_e = new Engine("бензиновый", 1812, 250);
        Base yamaha_b = new Base(70, 3, 397, 3560, 1230, 1230, 70);
        Jet_Sky yamaha = new Jet_Sky(yamaha_e, yamaha_b, "Yamaha", " FX CRUISER SVHO", 
        "Progressive Stepped V", "NanoXcel", "водомет", "сидя");
        test.add(yamaha);

        Engine dynali_e = new Engine("бензиновый", 2500, 180);
        Base dynali_b = new Base(190, 1, 700, 7950, 2000, 2000, 90);
        Helicopter dynali = new Helicopter(dynali_e, dynali_b, "Dynali", "H2S", 3650,
        550, 165, 7160);
        test.add(dynali);

        return test;
    }
}