
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Zaehler extends JFrame {

    // Attribute fuer Layout
    private JButton buttonRaus;
    private JButton buttonRein;
    private JButton buttonReset;
    private JLabel label;

    // Sonstige Attribute
    private int zahl;

    // Konstruktor
    public Zaehler() {

        // Layout und sonstige Fenstereigenschaften
        label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        buttonRaus = new JButton("raus");
        buttonRein = new JButton("rein");
        buttonReset = new JButton("Reset");

        add(buttonRaus, BorderLayout.WEST);
        add(buttonRein, BorderLayout.EAST);
        add(label);
        add(buttonReset, BorderLayout.SOUTH);

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // erstes mal wuerfeln und ausgeben
        zahl = 0;
        label.setText(String.format("Es befinden sich %d Besucher im Haus.", zahl));

        // Events
        buttonRaus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zahl--;
                label.setText(String.format("Es befinden sich %d Besucher im Haus.", zahl));
            }
        });
        buttonRein.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zahl++;
                label.setText(String.format("Es befinden sich %d Besucher im Haus.", zahl));
            }
        });
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zahl = 0;
                label.setText(String.format("Es befinden sich %d Besucher im Haus.", zahl));
            }
        });
    }

    // Main
    public static void main(String[] args) {
        new Zaehler();
    }
}
