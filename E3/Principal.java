package E3;

import java.util.Scanner;

import E3.base.factories.IVehiculoFactory;
import E3.impl.concreteFactories.ElectricoFactory;
import E3.impl.concreteFactories.GasolinaFactory;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n==== FABRICA DE VEHICULOS ====");
            System.out.println("1. Despachar automovil a gasolina");
            System.out.println("2. Despachar scooter a gasolina");
            System.out.println("3. Despachar automovil electrico");
            System.out.println("4. Despachar scooter electrico");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();

            IVehiculoFactory factory;
            DespachadorOrdenes despachador;

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Orden de fabricacion: Automovil a gasolina ---");
                    factory = new GasolinaFactory();
                    despachador = new DespachadorOrdenes(factory);
                    despachador.despacharAutomovil();
                    break;

                case 2:
                    System.out.println("\n--- Orden de fabricacion: Scooter a gasolina ---");
                    factory = new GasolinaFactory();
                    despachador = new DespachadorOrdenes(factory);
                    despachador.despacharScooter();
                    break;

                case 3:
                    System.out.println("\n--- Orden de fabricacion: Automovil electrico ---");
                    factory = new ElectricoFactory();
                    despachador = new DespachadorOrdenes(factory);
                    despachador.despacharAutomovil();
                    break;

                case 4:
                    System.out.println("\n--- Orden de fabricacion: Scooter electrico ---");
                    factory = new ElectricoFactory();
                    despachador = new DespachadorOrdenes(factory);
                    despachador.despacharScooter();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
