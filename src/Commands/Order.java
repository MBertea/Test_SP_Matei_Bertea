package Commands;

import Produse.Produs;

import java.util.List;

public interface Order {
    default Order execute(){ throw new UnsupportedOperationException(); }
    default List<Produs> getProduse(){ throw new UnsupportedOperationException(); }
}
