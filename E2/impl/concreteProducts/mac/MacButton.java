package E2.impl.concreteProducts.mac;

import E2.base.products.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Renderizando Button estilo macOS");
    }
}
