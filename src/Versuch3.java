import java.io.PrintStream;
import java.util.*;

public class Versuch3 extends Parent{

    int startWert;
    char rechenZeichen;
    int zweitWert;
    int ergebnis;
    boolean isFirstCalc = true;

    public void ausführen(){
        setStartWert();
    }

    public String Eingabe(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void setStartWert(){
        System.out.println("gib eine Zahl ein");
        startWert = Integer.parseInt(Eingabe());
        setRechenZeichen();
    }

    public void setRechenZeichen(){
        System.out.println("gib das Rechenzeichen ein");
        rechenZeichen = Eingabe().charAt(0);
        setZweitWert();
        isFirstCalc = false;
    }

    public void setZweitWert(){
        System.out.println("gib den zweiten Wert ein");
        zweitWert = Integer.parseInt(Eingabe());
        setErgebnis();
    }

    public void setErgebnis(){
        switch (rechenZeichen){
            case '+':
                ergebnis = startWert+zweitWert;
                break;
            case '-':
                ergebnis = startWert-zweitWert;
                break;
            case '*':
                ergebnis = startWert*zweitWert;
                break;
            case '/':
                ergebnis = startWert/zweitWert;
                break;
        }
        System.out.println("to break type break");
        if(Eingabe().equalsIgnoreCase("break")){
            printIntegerErgebnis(ergebnis);
        }else{
            startWert = ergebnis;
            setRechenZeichen();
        }
    }
}