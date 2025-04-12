import java.util.*;

public class Versuch4 extends Parent{

    String regex = "[\\-\\+\\*\\/]";
    int ergebnis;
    int[] zahlen = new int[100];
    String finalEingabe;
    String StringOPs = "";
    int ops;
    double zwischenErgebnis;

    public void ausführen(){
        finalEingabe = Eingabe();
        countOperators();
        split();
        ergebnis();
        printDoubleErgebnis(zwischenErgebnis);
    }

    public void ausführen(String input){
        ApplicationWindow fenster = new ApplicationWindow();
        finalEingabe = input;
        countOperators();
        split();
        ergebnis();
        fenster.ergebnisAusgeben(double2string(zwischenErgebnis));
    }

    public void countOperators(){
        for(int i = 0; i<finalEingabe.length(); i++){
            if(finalEingabe.charAt(i) == '+' || finalEingabe.charAt(i) == '-' || finalEingabe.charAt(i) == '*' || finalEingabe.charAt(i) == '/'){
                StringOPs = StringOPs + finalEingabe.charAt(i);
                ops++;
            }
        }
    }

    public void split(){
        String[] SZahlen = finalEingabe.split(regex);
        for(int i = 0; i < SZahlen.length; i++){
            zahlen[i] = String2int(SZahlen[i]);
        }
    }

    public void ergebnis() {
        zwischenErgebnis = zahlen[0];
        for (int i = 0; i < ops; i++) {
            switch (StringOPs.charAt(i)) {
                case '+':
                    zwischenErgebnis = zwischenErgebnis + zahlen[i + 1];  // Addition
                    break;
                case '-':
                    zwischenErgebnis = zwischenErgebnis - zahlen[i + 1];  // Subtraktion
                    break;
                case '*':
                    zwischenErgebnis = zwischenErgebnis * zahlen[i + 1];  // Multiplikation
                    break;
                case '/':
                    if (zahlen[i + 1] != 0) {
                        zwischenErgebnis = zwischenErgebnis / zahlen[i + 1];
                    } else {
                        System.out.println("Fehler: Division durch Null.");
                    }
                    break;
            }
        }
    }
}
