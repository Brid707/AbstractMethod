package E2;

import E2.base.factories.GUIFactory;
import E2.base.products.Button;
import E2.base.products.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        createUI(factory);
    }

    public void createUI(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
