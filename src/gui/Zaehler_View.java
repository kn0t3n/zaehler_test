package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Zaehler_View extends JFrame implements View {

    private JButton buttonRaus;
    private JButton buttonRein;
    private JButton buttonReset;
    private JLabel label;

    public Zaehler_View() throws HeadlessException {

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        buttonRaus = new JButton();
        buttonRein = new JButton();
        buttonReset = new JButton();

        add(buttonRaus, BorderLayout.WEST);
        add(buttonRein, BorderLayout.EAST);
        add(buttonReset, BorderLayout.SOUTH);
        add(label);

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void setLabelText(String text) {
        label.setText(text);
    }

    @Override
    public void setButtonLinksText(String text) {
        buttonRaus.setText(text);
    }

    @Override
    public void setButtonRechtsText(String text) {
        buttonRein.setText(text);
    }

    @Override
    public void setButtonUntenText(String text) {
        buttonReset.setText(text);
    }

    @Override
    public void setRaus(ActionListener actionListener) {
        buttonRaus.addActionListener(actionListener);
    }

    @Override
    public void setRein(ActionListener actionListener) {
        buttonRein.addActionListener(actionListener);
    }

    @Override
    public void reset(ActionListener actionListener) {
        buttonReset.addActionListener(actionListener);
    }
}
