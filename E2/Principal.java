package E2;

import E2.base.factories.GUIFactory;
import E2.impl.concreteFactories.MacFactory;
import E2.impl.concreteFactories.WinFactory;

public class Principal {

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WinFactory();
        } else if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Sistema operativo no soportado");
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
