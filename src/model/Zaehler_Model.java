package model;

import java.util.Observable;

public class Zaehler_Model extends Observable implements Model {

    private int zaehler;

    public Zaehler_Model() {
        resetZahl();
    }

    @Override
    public int resetZahl() {
        zaehler = 0;
        this.setChanged();
        this.notifyObservers();
        return zaehler;
    }

    @Override
    public int zahlPlus() {
        zaehler++;
        this.setChanged();
        this.notifyObservers();
        return zaehler;
    }

    @Override
    public int zahlMinus() {
        zaehler--;
        this.setChanged();
        this.notifyObservers();
        return zaehler;
    }

    @Override
    public String getButtonLinksText() {
        return "raus";
    }

    @Override
    public String getButtonRechtsText() {
        return "rein";
    }

    @Override
    public String getButtonUntenText() {
        return "Reset";
    }

    @Override
    public String getLabelText() {
        return "Es befinden sich " + zaehler + " Besucher im Haus";
    }
}
