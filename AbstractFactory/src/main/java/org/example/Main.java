package org.example;

import java.util.Scanner;

import org.example.factories.IFabricaMuebles;
import org.example.impl.concreteFactories.ArtDecoFactory;
import org.example.impl.concreteFactories.ModernoFactory;
import org.example.impl.concreteFactories.VictorianoFactory;
import org.example.products.IMesa;
import org.example.products.ISilla;
import org.example.products.ISofa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPedido = 1;

        System.out.println("==== FABRICA DE MUEBLES ====");

        while (true) {
            mostrarMenuPrincipal();
            int opcion = leerEntero(scanner, 1, 3, "Selecciona una opcion: ");

            if (opcion == 3) {
                System.out.println("Gracias por usar la fabrica de muebles.");
                break;
            }

            ISilla silla;
            ISofa sofa;
            IMesa mesa;

            if (opcion == 1) {
                IFabricaMuebles fabrica = seleccionarFabrica(scanner, "Selecciona el estilo del pedido completo:");
                silla = fabrica.crearSilla();
                sofa = fabrica.crearSofa();
                mesa = fabrica.crearMesa();
            } else {
                System.out.println("Crea tu combinacion personalizada:");
                IFabricaMuebles fabricaSilla = seleccionarFabrica(scanner, "Estilo para la silla:");
                IFabricaMuebles fabricaSofa = seleccionarFabrica(scanner, "Estilo para el sofa:");
                IFabricaMuebles fabricaMesa = seleccionarFabrica(scanner, "Estilo para la mesa:");

                silla = fabricaSilla.crearSilla();
                sofa = fabricaSofa.crearSofa();
                mesa = fabricaMesa.crearMesa();
            }

            int cantidadCosas = leerEntero(scanner, 1, 100, "Cuantas cosas quieres colocar en la mesa? ");
            procesarPedido(numeroPedido, silla, sofa, mesa, cantidadCosas);
            numeroPedido++;
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println();
        System.out.println("Menu principal:");
        System.out.println("1. Pedido de un solo estilo");
        System.out.println("2. Pedido personalizado (cualquier combinacion)");
        System.out.println("3. Salir");
    }

    private static IFabricaMuebles seleccionarFabrica(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        System.out.println("1. ArtDeco");
        System.out.println("2. Moderno");
        System.out.println("3. Victoriano");

        int estilo = leerEntero(scanner, 1, 3, "Elige una opcion de estilo: ");
        return crearFabrica(estilo);
    }

    private static IFabricaMuebles crearFabrica(int estilo) {
        switch (estilo) {
            case 1:
                return new ArtDecoFactory();
            case 2:
                return new ModernoFactory();
            case 3:
                return new VictorianoFactory();
            default:
                throw new IllegalArgumentException("Estilo no soportado: " + estilo);
        }
    }

    private static int leerEntero(Scanner scanner, int min, int max, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Debes escribir un numero.");
                scanner.next();
                continue;
            }

            int valor = scanner.nextInt();
            if (valor >= min && valor <= max) {
                return valor;
            }

            System.out.println("Opcion fuera de rango. Debe estar entre " + min + " y " + max + ".");
        }
    }

    private static void procesarPedido(int numeroPedido, ISilla silla, ISofa sofa, IMesa mesa, int cantidadCosas) {
        System.out.println();
        System.out.println("--- Pedido #" + numeroPedido + " ---");
        silla.sentarse();
        System.out.println(silla.getEstilo());

        sofa.recostarse();
        System.out.println(sofa.getEstilo());

        mesa.colocarCosas(cantidadCosas);
        System.out.println(mesa.getEstilo());
        System.out.println("Cosas colocadas en la mesa: " + mesa.getNoCosas());
        System.out.println("Pedido creado correctamente.");
    }
}