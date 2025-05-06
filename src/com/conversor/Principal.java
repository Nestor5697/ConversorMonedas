package com.conversor;
import com.conversor.ConversorMoneda;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ConversorMoneda conversor = new ConversorMoneda();

    while (true) {
      System.out.println("********************************************************");
      System.out.println("**    -Bienvenido al sistema conversor de monedas-    **\n");
      System.out.println(" Seleccione el tipo de moneda a convertir: \n");
      System.out.println("  1)   Dolar a peso colomabiano (cop)\n" +
              "  2)   Peso colombiano a Dolar\n" +
              "  3)   Dolar a Real brasileño\n" +
              "  4)   Real brasiliño a Dolar\n" +
              "  5)   Dolar a peso argentino\n" +
              "  6)   Peso argentino a Dolar\n" +
              "  7)   Salir!");
      System.out.println(" ");

      int opcion = scanner.nextInt();

      if(opcion == 7){
        System.out.println("Gracias por utilizar el conversor. ¡Hasta luego!");
        break;
      }

      System.out.println("Ingresa la Cantidad: ");
      double cantidad = scanner.nextDouble();

      switch (opcion){
        case 1 -> conversor.convertir("USD", "COP", cantidad);
        case 2 -> conversor.convertir("COP", "USD", cantidad);
        case 3 -> conversor.convertir("USD", "BRL", cantidad);
        case 4 -> conversor.convertir("BRL", "USD", cantidad);
        case 5 -> conversor.convertir("USD", "ARS", cantidad);
        case 6 -> conversor.convertir("ARS", "USD", cantidad);
        default -> System.out.println("¡Opcion Invalida!");

      }
    }
    scanner.close();
  }
}
