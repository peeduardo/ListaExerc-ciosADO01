import java.util.Scanner;
public class lista1exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira três números decimais para efetuar as raízes da equação de Bhaskara.");

        System.out.println("Insira o primeiro número: ");
        double a = input.nextDouble();

        System.out.println("Insira o segundo número: ");
        double b = input.nextDouble();

        System.out.println("Insira o terceiro número: ");
        double c = input.nextDouble();

        if (a == 0){
            System.out.println("Impossível calcular.");
        } else {
            double discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                System.out.println("Impossível calcular: raiz de número negativo.");
            } else {
                double raiz1 = (- b + Math.sqrt(discriminante)) /(2 * a);
                double raiz2 = (- b - Math.sqrt(discriminante)) /(2 * a);
                System.out.printf("As raízes da equação são: %.2f e %.2f%n", raiz1, raiz2);
            }    
        }
    }
    
}