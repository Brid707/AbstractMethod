package E3.impl.concreteProducts.gasolina;

import E3.base.products.IAutomovil;

public class AutomovilGasolina implements IAutomovil {

    @Override
    public void fabricar() {
        System.out.println("Fabricando automovil con motor a gasolina...");
    }

    @Override
    public String getDescripcion() {
        return "Automovil de gasolina listo para despacho";
    }
}
