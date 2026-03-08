package org.example.factories;

import org.example.products.IMesa;
import org.example.products.ISilla;
import org.example.products.ISofa;

public interface IFabricaMuebles {
    ISilla crearSilla();
    ISofa crearSofa();
    IMesa crearMesa();
}
