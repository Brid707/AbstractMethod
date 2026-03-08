package org.example.impl.ConcreteProducts.ArtDeco;

import org.example.products.ISofa;

public class SofaArtDeco implements ISofa{

    @Override
    public void recostarse() {
        System.out.println("Recostado en el Sofa");
    }

    @Override
    public String getEstilo() {
        return "Sofa Estilo ArtDeco";
    }

}
