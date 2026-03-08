package E3.impl.concreteProducts.gasolina;

import E3.base.products.IScooter;

public class ScooterGasolina implements IScooter {

    @Override
    public void fabricar() {
        System.out.println("Fabricando scooter con motor a gasolina...");
    }

    @Override
    public String getDescripcion() {
        return "Scooter de gasolina listo para despacho";
    }
}
