package org.example.impl.ConcreteProducts.Victoriano;

import org.example.products.ISofa;

public class SofaVictoriano implements ISofa {

	@Override
	public void recostarse() {
		System.out.println("Recostado en el sofa Victoriano");
	}

	@Override
	public String getEstilo() {
		return "Sofa Estilo Victoriano";
	}
}
