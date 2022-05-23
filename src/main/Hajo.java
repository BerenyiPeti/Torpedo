package main;

public class Hajo {
    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }

    public String talalat(int poz) {
        int i = 0;
        while (i < 3 && !(pozicio[i] == poz)) {
            i++;
        }
        
        return i < 3? "talált" : "mellé";
    }
    
    public void kiir() {
        for (int i = 0; i < pozicio.length; i++) {
            System.out.println(pozicio[i]);
        }
    }
}
