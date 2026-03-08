package E3.base.factories;

import E3.base.products.IAutomovil;
import E3.base.products.IScooter;

public interface IVehiculoFactory {
    IAutomovil crearAutomovil();
    IScooter crearScooter();
}
