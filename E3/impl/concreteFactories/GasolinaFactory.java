package E3.impl.concreteFactories;

import E3.base.factories.IVehiculoFactory;
import E3.base.products.IAutomovil;
import E3.base.products.IScooter;
import E3.impl.concreteProducts.gasolina.AutomovilGasolina;
import E3.impl.concreteProducts.gasolina.ScooterGasolina;

public class GasolinaFactory implements IVehiculoFactory {

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilGasolina();
    }

    @Override
    public IScooter crearScooter() {
        return new ScooterGasolina();
    }
}
