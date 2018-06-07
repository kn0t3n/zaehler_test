package gui;

import gui.View;
import gui.Zaehler_View;
import model.Zaehler_Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Zaehler_Presenter implements Observer {

    private View view;
    private Zaehler_Model zaehler_model;

    public Zaehler_Presenter() {
        this.view = new Zaehler_View();
        this.zaehler_model = new Zaehler_Model();

        this.view.setLabelText(zaehler_model.getLabelText());
        this.view.setButtonLinksText(zaehler_model.getButtonLinksText());
        this.view.setButtonRechtsText(zaehler_model.getButtonRechtsText());
        this.view.setButtonUntenText(zaehler_model.getButtonUntenText());

        this.zaehler_model.addObserver(this);

//        this.zaehler_model.getLabelText();

        this.view.setRaus(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zaehler_model.zahlMinus();
            }
        });

        this.view.setRein(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zaehler_model.zahlPlus();
            }
        });

        this.view.reset(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zaehler_model.resetZahl();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        view.setLabelText(zaehler_model.getLabelText());

    }
}
