public class Main {

    public static void main(String[] args) {
        ausführen();
    }

    public static void ausführen(){
        Versuch1 V1 = new Versuch1(); //funktioniert
        Versuch2 V2 = new Versuch2(); //funktioniert
        Versuch3 V3 = new Versuch3();
        Versuch4 V4 = new Versuch4(); //funktioniert
        V4.ausführen();
    }
}