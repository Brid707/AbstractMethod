package E2.impl.concreteProducts.windows;

import E2.base.products.Button;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Renderizando Button estilo Windows");
    }
}
