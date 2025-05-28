import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        System.out.println("=== Estudiante 1 ===");
        System.out.print("Nombre: ");
        estudiante1.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante1.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante1.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("=== Estudiante 2 ===");
        System.out.print("Nombre: ");
        estudiante2.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante2.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante2.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("=== Estudiante 3 ===");
        System.out.print("Nombre: ");
        estudiante3.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante3.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante3.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine(); 

        System.out.println("=== Estudiante 4 ===");
        System.out.print("Nombre: ");
        estudiante4.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante4.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante4.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine(); 

        System.out.println("=== Estudiante 5 ===");
        System.out.print("Nombre: ");
        estudiante5.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante5.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante5.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();
    }
}
