package Produse;
import Commands.Visitee;
import Commands.Visitor;

public class Mancare implements  Produs, Visitee{
    int cantitate;
    String nume;
    double pret;

    @Override
    public int getCantitate() {
        return cantitate;
    }

    @Override
    public double getPret() {
        return pret;
    }

    public Mancare(int cantitate, String nume, double pret) {
        this.cantitate = cantitate;
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "" +cantitate + " x " + nume + " x " + pret + " RON";
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void accept(Visitor v) {
        v.visitMancare(this);
    }
}
