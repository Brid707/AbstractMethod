package E2.impl.concreteFactories;

import E2.base.factories.GUIFactory;
import E2.base.products.Button;
import E2.base.products.Checkbox;
import E2.impl.concreteProducts.mac.MacButton;
import E2.impl.concreteProducts.mac.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
