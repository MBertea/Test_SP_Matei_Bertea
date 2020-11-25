package Commands;

import Produse.Produs;

import java.util.List;

public class DisplayOrderCmd implements  Order{
    List<Produs> produse;

    public DisplayOrderCmd(Order order) {
        this.produse = order.getProduse();
    }

    @Override
    public Order execute() {
        double total = 0;
        CalculatorTotal calculator = new CalculatorTotal();
        for (Produs produs : this.produse) {
            total += produs.getCantitate()*produs.getPret();
            produs.accept(calculator);
        }
        calculator.printTotal();
        return this;
    }
}
