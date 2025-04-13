import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationWindow extends JFrame{


    JTextField 	textfield_input;  //definiert welche Art textfield_input ist
    JTextField 	textfield_ergebnis; //definiert welche Art textfield_ergebnis ist
    JButton		button; //definiert welche Art button ist
    public ApplicationWindow() {
        this.getContentPane().setLayout(null);
        this.setTitle("Calculator"); //setzt die Anzeige vom Fenster oben auf Calculator
        this.initWindow();
    }

    public void initWindow() {
        textfield_input = new JTextField();
        textfield_ergebnis = new JTextField();
        button = new JButton("rechnen"); //das in den Klammern ist der Text des Buttons

        textfield_input.setBounds(10, 10, 300, 30); //markiert wie und wo Feld platziert werden soll
        textfield_ergebnis.setBounds(10, 100, 300, 30); //markiert wie und wo Feld platziert werden soll
        button.setBounds(10, 55, 100, 30); //markiert wie und wo Button platziert werden soll

        this.getContentPane().add(textfield_input); //fügt Feld dem Fenster hinzu
        this.getContentPane().add(textfield_ergebnis); //fügt Feld dem Fenster hinzu
        this.getContentPane().add(button); //fügt Button dem Fenster hinzu

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                berechneButtonClicked();
                //hier muss später das Berechnen gestartet werden
            }
        });
        this.pack(); //passt die Größe des Fensters automatisch an
    }

    public void berechneButtonClicked() {
        Versuch4 V4 = new Versuch4();
        Parent p = new Parent();
        String input = "";
            input = textfield_input.getText();
        if(input != null) {
            V4.ausführen(input);
            ergebnisAusgeben(p.double2string(V4.zwischenErgebnis));
        }
    }

    public void ergebnisAusgeben(String start) {
        String Ergebnis = start;
        textfield_ergebnis.setText(Ergebnis);
    }

}