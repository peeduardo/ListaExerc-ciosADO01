import java.util.Scanner;
public class lista1exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os valores decimais de: ");

        System.out.println("A: ");
        double a = input.nextDouble();

        System.out.println("B: ");
        double b = input.nextDouble();

        System.out.println("C: ");
        double c = input.nextDouble();

        double areaTri = (a * c) /2;
        System.out.println("A área do triângulo retângulo que tem A por base e C por altura, é igual a: " + areaTri);

        double areaCir = Math.PI * c * c;
        System.out.println("A área do círculo de raio C é igual a: " + areaCir);

        double areaTrap = ((a + b) * c) /2;
        System.out.println("A área do trapézio que tem A e B por base e C por altura, é igual a: " + areaTrap);

        double areaQuadB = b * b;
        System.out.println("A área do quadrado que tem lado B, é igual a: " + areaQuadB);

        double areaRetAB = a * b;
        System.out.println("A área do retângulo que tem lados A e B, é igual a: " + areaRetAB);

        double perim = 2 * (a + b);
        System.out.println("O perímetro do retângulo que tem lados A e B, é igual a: " + perim);
    }

}
