import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma hora entre 00:00 e 23:59");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        int hour = scanner.nextInt();
        System.out.println("Digite os minutos: ");
        int minute = scanner.nextInt();

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Hora inválida");
        } else {
            Watch watch = new Watch();
            int angule = watch.returnAnguleWatch(hour, minute);
            System.out.println("O ângulo entre os ponteiros é: " + angule);
        }

        scanner.close();
    }
}