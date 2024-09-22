import java.util.Scanner;
public class lista1exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos ler dois lados A e B de um triângulo retângulo e calcular a hipotenusa do triângulo.");
        
        System.out.println("Insira o valor de A: ");
        double a = input.nextDouble();

        System.out.println("Insira o valor de B: ");
        double b = input.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);
        System.out.println("O resultado será: " + hipotenusa);
        
    }

}
