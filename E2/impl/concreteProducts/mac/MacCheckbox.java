package E2.impl.concreteProducts.mac;

import E2.base.products.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Renderizando Checkbox estilo macOS");
    }
}
