package Produse;
import Commands.Visitee;

public interface Produs extends Visitee{
    public double getPret();
    public String toString();
    public int getCantitate();
}
