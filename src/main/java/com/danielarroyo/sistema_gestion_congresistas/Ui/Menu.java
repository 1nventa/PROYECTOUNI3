package com.danielarroyo.sistema_gestion_congresistas.Ui;


import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar congresista");
            System.out.println("2. Mostrar congresistas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Funcionalidad para registrar");
                    break;
                case 2:
                    System.out.println("Funcionalidad para mostrar");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);

        sc.close();
    }
}
