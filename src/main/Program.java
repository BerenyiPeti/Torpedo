package main;

import java.util.Random;
import java.util.Scanner;

public class Program {
    private static int lovesek;
    private static int talalatok;
    

    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
       
        int hajoEleje = rnd.nextInt(5) + 1;
        Hajo hajo = new Hajo(new int[]{hajoEleje, hajoEleje + 1, hajoEleje + 2});
        do {
            System.out.print("Hova szeretnél lőni? ");
            int tipp = sc.nextInt();
            System.out.println(hajo.talalat(tipp));
            if ((hajo.talalat(tipp)).equals("talált")) {
                talalatok++;
            }
            lovesek++;
            
        } while (!(talalatok == 3));
        
        System.out.println("Talált, süllyedt " + lovesek + " lövésből!");
        
        
        //hajo.kiir();
        
    }

}
