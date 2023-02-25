package be.vdab.ondernemingsnummer.domain;

import be.vdab.ondernemingsnummer.constraints.OndernemingsNummer;

public class Firma {
    @OndernemingsNummer
    private Integer ondernemingsNummer;

    public int getOndernemingsNummer() {
        return ondernemingsNummer;
    }

    public void setOndernemingsNummer(int ondernemingsNummer) {
        this.ondernemingsNummer = ondernemingsNummer;
    }
}
