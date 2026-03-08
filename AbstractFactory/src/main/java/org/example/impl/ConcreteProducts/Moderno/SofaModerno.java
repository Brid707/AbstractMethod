package org.example.impl.ConcreteProducts.Moderno;

import org.example.products.ISofa;

public class SofaModerno implements ISofa {

	@Override
	public void recostarse() {
		System.out.println("Recostado en el sofa Moderno");
	}

	@Override
	public String getEstilo() {
		return "Sofa Estilo Moderno";
	}
}
