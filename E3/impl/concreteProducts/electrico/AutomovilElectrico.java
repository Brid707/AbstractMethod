package E3.impl.concreteProducts.electrico;

import E3.base.products.IAutomovil;

public class AutomovilElectrico implements IAutomovil {

    @Override
    public void fabricar() {
        System.out.println("Fabricando automovil con motor electrico...");
    }

    @Override
    public String getDescripcion() {
        return "Automovil electrico listo para despacho";
    }
}
