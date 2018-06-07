package Kontroll;

import java.text.Collator;
import java.util.ArrayList;

public class Billett implements Comparable<Billett>{

    private final static Collator kollator = Collator.getInstance();

    private String billettkode;
    private Visning visning;
    private boolean erBetalt;

    private ArrayList<Plass> plasser = new ArrayList<>();

    public Billett(String billettkode) {
        this.billettkode = billettkode;
    }

    public Billett(String billettkode, Visning visning, boolean erBetalt) {
        this.billettkode = billettkode;
        this.visning = visning;
        this.erBetalt = erBetalt;
    }

    /**
     * Legger til en Plass i Billett sin ArrayList over Plasser
     * @param plassen
     */
    public void leggTilPlass(Plass plassen) {
        plasser.add(plassen);
    }

    public String getBillettkode() {
        return billettkode;
    }

    public void setBillettkode(String billettkode) {
        this.billettkode = billettkode;
    }

    public Visning getVisning() {
        return visning;
    }

    public void setVisning(Visning visning) {
        this.visning = visning;
    }

    public boolean isErBetalt() {
        return erBetalt;
    }

    public void setErBetalt(boolean erBetalt) {
        this.erBetalt = erBetalt;
    }

    @Override
    public int compareTo(Billett o) {
        return kollator.compare(this.billettkode, o.getBillettkode());
    }
}
