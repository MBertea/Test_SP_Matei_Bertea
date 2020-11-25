package Commands;

import Produse.Lichide;
import Produse.Mancare;
import Produse.Produs;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderCmd implements Order{
    List<Produs> produse;

    public CreateOrderCmd() {
        this.produse = new ArrayList<Produs>();
    }

    @Override
    public Order execute() {
        this.produse.add(new Mancare(2, "Supe pui", 7.5));
        this.produse.add(new Mancare(1, "Friptura de porc la tava", 15));
        this.produse.add(new Mancare(1, "Snitez vienez", 13));
        this.produse.add(new Mancare(2, "Cartofi Wedges", 6));
        this.produse.add(new Mancare(2, "Salata rosii", 5));
        this.produse.add(new Lichide(2, "Ape minerale", 3));

        return this;
    }

    public List<Produs> getProduse() {
        return produse;
    }
}
