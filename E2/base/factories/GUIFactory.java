package E2.base.factories;

import E2.base.products.Button;
import E2.base.products.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
