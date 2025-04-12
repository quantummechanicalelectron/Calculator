import java.util.*;

public class Parent {


    public String Eingabe(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void printIntegerErgebnis(int ergebnis){
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }

    public void printDoubleErgebnis(double doubleVariable){
        System.out.println("Das Ergebnis ist: " + doubleVariable);
    }

    public void printStringErgebnis(String stringVariable){
        System.out.println("Das Ergebnis ist: " + stringVariable);
    }

    public int String2int(String start){
        return Integer.parseInt(start);
    }

    public String double2string(double start){
        return String.valueOf(start);
    }
}