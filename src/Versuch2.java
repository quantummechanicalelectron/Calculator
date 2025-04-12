import java.util.Scanner;

public class Versuch2 extends Parent{

    String regex = "[ ]";

    String Eingabe;
    String[] getrennteEingabe;
    int[] integerEingabe = new int[2];
    char rechenzeichen;

    int ergebnis;

    public void ausführen(){
        scannen();
        trennen();
        rechnen();
        test();
    }

    public void scannen(){
        Scanner in = new Scanner(System.in);
        Eingabe = in.nextLine();
    }

    public void trennen(){
        getrennteEingabe = Eingabe.split(regex);

        integerEingabe[0] = Integer.parseInt(getrennteEingabe[0]);
        rechenzeichen = getrennteEingabe[1].charAt(0);
        integerEingabe[1] = Integer.parseInt(getrennteEingabe[2]);
    }

    public void rechnen(){
        if(rechenzeichen == '-'){
            ergebnis = integerEingabe[0] - integerEingabe[1];
        }else if (rechenzeichen == '+'){
            ergebnis = integerEingabe[0] + integerEingabe[1];
        }else if (rechenzeichen == '*'){
            ergebnis = integerEingabe[0] * integerEingabe[1];
        }else if (rechenzeichen == '/'){
            ergebnis = integerEingabe[0] / integerEingabe[1];
        }
    }

    public void test(){
        printIntegerErgebnis(ergebnis);
    }
}