package Commands;

import Produse.Lichide;
import Produse.Mancare;

public class CalculatorTotal implements Visitor<Double> {
    double total = 0;

    @Override
    public Double visitMancare(Mancare mancare) {
        System.out.println("" +mancare.getCantitate() + " x " + mancare.getNume() + " x " + mancare.getPret() + " RON");
        this.total += mancare.getPret()*mancare.getCantitate();
        return mancare.getPret()*mancare.getCantitate();
    }

    @Override
    public Double visitLichide(Lichide lichide) {
        System.out.println("" +lichide.getCantitate() + " x " + lichide.getNume() + " x " + lichide.getPret() + " RON");
        this.total += lichide.getPret()*lichide.getCantitate();

        return lichide.getPret()*lichide.getCantitate();
    }

    public void printTotal(){
        System.out.println();
        System.out.println("TOTAL: "+(total%1==0? String.format("%.0f", total) : total)+" RON");

    }
}
