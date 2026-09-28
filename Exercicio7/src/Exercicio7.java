import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Usuario 1 ===");
        System.out.print("Dia do aniversario: ");
        int d1 = sc.nextInt();
        System.out.print("Mes do aniversario: ");
        int m1 = sc.nextInt();

        System.out.println("=== Usuario 2 ===");
        System.out.print("Dia do aniversario: ");
        int d2 = sc.nextInt();
        System.out.print("Mes do aniversario: ");
        int m2 = sc.nextInt();

        // Converte (mes, dia) em um valor numerico para comparacao
        int diaAno1 = m1 * 31 + d1;
        int diaAno2 = m2 * 31 + d2;

        if (diaAno1 < diaAno2) {
            System.out.println("O Usuario 1 faz aniversario primeiro.");
        } else if (diaAno2 < diaAno1) {
            System.out.println("O Usuario 2 faz aniversario primeiro.");
        } else {
            System.out.println("Fazem aniversario no mesmo dia.");
        }

        sc.close();
    }
}
