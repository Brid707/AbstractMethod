package E2.impl.concreteProducts.windows;

import E2.base.products.Checkbox;

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Renderizando Checkbox estilo Windows");
    }
}
