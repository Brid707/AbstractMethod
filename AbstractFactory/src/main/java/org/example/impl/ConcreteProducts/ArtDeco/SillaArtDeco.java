package org.example.impl.ConcreteProducts.ArtDeco;

import org.example.products.ISilla;

public class SillaArtDeco implements ISilla {

    @Override
    public void sentarse() {
        System.out.println("Sentado en silla ArtDeco");
    }

    @Override
    public String getEstilo() {
        return "Silla Estilo ArtDeco";
    }

}