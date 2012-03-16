package ceteproblemi;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CeteProblemi {

    public static void main(String[] args) {
        double maxUye = 50,
                mevcutUye = 0,
                hapistekiUye = 0;
        double yakalanmaOran = 0.05,
                kacmaOran = 0.1;
        double hafta = 50;
        
//        NumberFormat nf = new DecimalFormat("#0.0000");
        
        for (int h = 1; h <= hafta; h++) {
            double dortteBir = (maxUye - mevcutUye) / 4;
            double yakalanan = mevcutUye * yakalanmaOran;
            double kacan = hapistekiUye * kacmaOran;

            mevcutUye += dortteBir - yakalanan + kacan;
            hapistekiUye += yakalanan - kacan;

            System.out.println("Hafta    :" + h);
            System.out.println("Toplama  :" + dortteBir);
            System.out.println("Yakalanma:" + yakalanan);
            System.out.println("Kaçış    :" + kacan);
            System.out.println("Kodeste  :" + hapistekiUye);
            System.out.println("Çete     :" + mevcutUye);
            System.out.println("");

//            System.out.println(h + " \t "
//                    + nf.format(dortteBir) + " \t "
//                    + nf.format(yakalanan) + " \t "
//                    + nf.format(kacan) + " \t "
//                    + nf.format(hapistekiUye) + " \t "
//                    + nf.format(mevcutUye) + " \t ");
        }
    }
}
