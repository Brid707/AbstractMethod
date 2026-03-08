package org.example.impl.concreteFactories;

import org.example.factories.IFabricaMuebles;
import org.example.products.IMesa;
import org.example.products.ISilla;
import org.example.products.ISofa;
import org.example.impl.ConcreteProducts.Moderno.MesaModerna;
import org.example.impl.ConcreteProducts.Moderno.SillaModerna;
import org.example.impl.ConcreteProducts.Moderno.SofaModerno;

public class ModernoFactory implements IFabricaMuebles{

    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaModerna();
    }

}
