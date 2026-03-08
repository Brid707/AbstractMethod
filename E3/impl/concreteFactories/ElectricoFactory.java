package E3.impl.concreteFactories;

import E3.base.factories.IVehiculoFactory;
import E3.base.products.IAutomovil;
import E3.base.products.IScooter;
import E3.impl.concreteProducts.electrico.AutomovilElectrico;
import E3.impl.concreteProducts.electrico.ScooterElectrico;

public class ElectricoFactory implements IVehiculoFactory {

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilElectrico();
    }

    @Override
    public IScooter crearScooter() {
        return new ScooterElectrico();
    }
}
