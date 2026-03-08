package E3.impl.concreteProducts.electrico;

import E3.base.products.IScooter;

public class ScooterElectrico implements IScooter {

    @Override
    public void fabricar() {
        System.out.println("Fabricando scooter con motor electrico...");
    }

    @Override
    public String getDescripcion() {
        return "Scooter electrico listo para despacho";
    }
}
