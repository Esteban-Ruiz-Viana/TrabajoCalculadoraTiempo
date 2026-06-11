package CalculadoraTiempoCli;
import java.util.Scanner;

public class CalculadoraTiempoCli {

    private final Scanner scanner;

    public CalculadoraTiempoCli() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = capturarOpcion();
            procesarOpcion(opcion);
            System.out.println();
        } while (opcion != 5);
    }

    private void mostrarMenu() {
        System.out.println("=== Calculadora de Tiempo ===");
        System.out.println("1. Convertir horas a minutos");
        System.out.println("2. Convertir minutos a segundos");
        System.out.println("3. Convertir días a horas");
        System.out.println("4. Sumar minutos a una hora");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int capturarOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1: menuHorasAMinutos(); break;
            case 2: menuMinutosASegundos(); break;
            case 3: menuDiasAHoras(); break;
            case 4: menuSumarMinutos(); break;
            case 5: System.out.println("¡Hasta luego!"); break;
            default: System.out.println("Opción no válida. Por favor, intente de nuevo."); break;
        }
    }

    private void menuHorasAMinutos() {
        System.out.print("Ingrese la cantidad de horas: ");
        try {
            int horas = Integer.parseInt(scanner.nextLine());

            int minutos = HoraMinutos.convertirHorasAMinutos(horas);

            System.out.println(horas + " horas equivalen a " + minutos + " minutos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número entero válido.");
        }
    }

    private void menuMinutosASegundos() {
        System.out.print("Ingrese la cantidad de minutos: ");
        try {
            int minutos = Integer.parseInt(scanner.nextLine());

            int segundos = MinutosSegundos.convertirMinutosASegundos(minutos);

            System.out.println(minutos + " minutos equivalen a " + segundos + " segundos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número entero válido.");
        }
    }

    private void menuDiasAHoras() {
        System.out.print("Ingrese la cantidad de días: ");
        try {

            long dias = Long.parseLong(scanner.nextLine());
            long horas = DiasHoras.convertirDiasAHoras(dias);

            System.out.println(dias + " días equivalen a " + horas + " horas.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número entero válido.");
        }
    }

    private void menuSumarMinutos() {
        try {
            System.out.print("Ingrese la hora inicial (HH:MM): ");
            String horaInicial = scanner.nextLine();

            System.out.print("Ingrese los minutos a sumar: ");
            int minutosASumar = Integer.parseInt(scanner.nextLine());

            SumarMinutos calculadora = new SumarMinutos();
            String nuevaHora = calculadora.sumarMinutosAHora(horaInicial, minutosASumar);

            System.out.println("La nueva hora es: " + nuevaHora);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los minutos a sumar deben ser un número entero.");
        }
    }
}