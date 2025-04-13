public class Main {

    public static void main(String[] args) {
        ausführen();
    }

    public static void ausführen(){
        Main main = new Main();
        Versuch1 V1 = new Versuch1(); //funktioniert
        Versuch2 V2 = new Versuch2(); //funktioniert
        Versuch3 V3 = new Versuch3();
        Versuch4 V4 = new Versuch4(); //funktioniert
        main.fensterInitialisieren();
    }

    public void fensterInitialisieren(){
        ApplicationWindow theAppWindow = new ApplicationWindow();
        theAppWindow.setBounds(10, 10, 420, 180);
        theAppWindow.show();
    }
}