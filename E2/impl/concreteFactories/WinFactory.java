package E2.impl.concreteFactories;

import E2.base.factories.GUIFactory;
import E2.base.products.Button;
import E2.base.products.Checkbox;
import E2.impl.concreteProducts.windows.WinButton;
import E2.impl.concreteProducts.windows.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
