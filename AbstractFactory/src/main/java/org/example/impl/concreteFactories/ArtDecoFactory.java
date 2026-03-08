package org.example.impl.concreteFactories;

import org.example.factories.IFabricaMuebles;
import org.example.products.IMesa;
import org.example.products.ISilla;
import org.example.products.ISofa;
import org.example.impl.ConcreteProducts.ArtDeco.MesaArtDeco;
import org.example.impl.ConcreteProducts.ArtDeco.SillaArtDeco;
import org.example.impl.ConcreteProducts.ArtDeco.SofaArtDeco;

public class ArtDecoFactory implements IFabricaMuebles{

    @Override
    public ISilla crearSilla() {
        return new SillaArtDeco();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaArtDeco();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaArtDeco();
    }

}
