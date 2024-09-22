import java.util.Scanner;
public class lista1exe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira três números decimais. Primeiro valor: ");
        double a = input.nextDouble();

        System.out.println("Segundo valor: ");
        double b = input.nextDouble();

        System.out.println("Terceiro valor: ");
        double c = input.nextDouble();

        if (a < b) {
            double valMaiorTemporario = a;
            a = b;
            b = valMaiorTemporario;
        }
        if (a < c) {
            double valMaiorTemporario = a;
            a = c;
            c = valMaiorTemporario;
        }
        if (b < c){
            double valMaiorTemporario = b;
            b = c;
            c = valMaiorTemporario;
        }

        if (a >= (b + c)) {
            System.out.println("Não forma triângulo.");
        } else if (a == b && b == c) {
            System.out.println("Triângulo equilátero.");
        } else if (a * a == (b * b + c * c)) {
            System.out.println("Triângulo retângulo.");
        } else if (a * a > (b * b + c * c)) {
            System.out.println("Triângulo obtusângulo.");
        } else {
            System.out.println("Triângulo acutângulo.");
        }
        
        if (a == b || a == c || b == c) {
            System.out.println("Triângulo isósceles.");
        }

    }

}
