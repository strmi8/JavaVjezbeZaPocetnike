package Udemy2;
// tipovi podataka njihove min i max vrijednosti.
public class Main {

    public static void main(String[] args){
        long broj1 = 60L;
        long broj2 = Long.MAX_VALUE;
        long broj3 = Long.MIN_VALUE;
        System.out.println("iznos long broja je: "+ broj1);
        System.out.println("Max iznos long broja je: "+ broj2);
        System.out.println("Min iznos long broja je: "+ broj3);

        short broj4 = 600;
        short broj5 = Short.MAX_VALUE;
        short broj6 = Short.MIN_VALUE;
        System.out.println("iznos short broja je: "+ broj4);
        System.out.println("Max iznos short broja je: "+ broj5);
        System.out.println("Min iznos short broja je: "+ broj6);

        byte broj7 = 60;
        byte broj8 = Byte.MAX_VALUE;
        byte broj9 = Byte.MIN_VALUE;
        System.out.println("iznos byte broja je: "+ broj7);
        System.out.println("Max iznos byte broja je: "+ broj8);
        System.out.println("Min iznos byte broja je: "+ broj9);


        byte myNewByteValue = (byte)(broj1/2);
        System.out.println("iznos podjeljenog broja u byte zapisu je: "+ myNewByteValue);


    }
}
