import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do(a) recruta: ");
        String nome = scanner.nextLine().toUpperCase();
        System.out.println("Olá, " + nome + "!");

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Seu peso é: " + peso + " kg");

        System.out.println("Digite a sua altura em centímetros: ");
        double alturaCm = scanner.nextDouble();

        double alturaM = alturaCm / 100;
        double imc = peso / Math.pow(alturaM, 2);

        System.out.println("Seu IMC é: " + imc);

        if (peso < 50) {
            System.out.println("Você está abaixo do peso ideal para o alistamento.");
        } else if (peso >= 50 && peso <= 100) {
            System.out.println("Você está dentro do peso ideal para o alistamento.");
        } else {
            System.out.println("Você está acima do peso ideal para o alistamento.");
        }

        scanner.close();
    }
}