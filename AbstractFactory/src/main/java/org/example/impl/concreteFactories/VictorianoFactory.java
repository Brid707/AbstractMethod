package org.example.impl.concreteFactories;

import org.example.factories.IFabricaMuebles;
import org.example.products.IMesa;
import org.example.products.ISilla;
import org.example.products.ISofa;
import org.example.impl.ConcreteProducts.Victoriano.MesaVictoriana;
import org.example.impl.ConcreteProducts.Victoriano.SillaVictoriana;
import org.example.impl.ConcreteProducts.Victoriano.SofaVictoriano;

public class VictorianoFactory implements IFabricaMuebles{

    @Override
    public ISilla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaVictoriana();
    }

}