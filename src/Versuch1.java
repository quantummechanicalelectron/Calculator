import java.util.*;

public class Versuch1{

    String Eingabe;
    String[] Teile;
    int ergebnis;
    String regex = "[+]";
    int[] intTeile = new int[2];

    public void ausführen(){
        scannen();
        ersteRechnung(Eingabe);
        rechnen(Teile);
        test(Teile);
    }

    public void scannen(){
        Scanner in = new Scanner(System.in);
        Eingabe = in.nextLine();
    }

    public void ersteRechnung(String Eingabe){
        Teile = Eingabe.split(regex);
    }

    public void rechnen(String[] Teile){
        for(int i = 0; i < Teile.length; i++){
            intTeile[i] = Integer.parseInt(Teile[i]);
        }
        ergebnis = intTeile[0] + intTeile[1];
    }

    public void test(String[] Teile){
        System.out.println(ergebnis);
    }
}