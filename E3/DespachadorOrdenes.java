package E3;

import E3.base.factories.IVehiculoFactory;
import E3.base.products.IAutomovil;
import E3.base.products.IScooter;

public class DespachadorOrdenes {

    private final IVehiculoFactory factory;

    public DespachadorOrdenes(IVehiculoFactory factory) {
        this.factory = factory;
    }

    public void despacharAutomovil() {
        IAutomovil automovil = factory.crearAutomovil();
        automovil.fabricar();
        System.out.println(automovil.getDescripcion());
    }

    public void despacharScooter() {
        IScooter scooter = factory.crearScooter();
        scooter.fabricar();
        System.out.println(scooter.getDescripcion());
    }
}
