import java.util.Scanner;
public class lista1exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu número de cadastro do funcionário: ");
        int numCadas = input.nextInt();

        System.out.println("Insira seu número de horas trabalhadas: ");
        int numHor = input.nextInt();

        System.out.println("Insira o valor de seu salário por hora: ");
        float salHor = input.nextFloat();

        float salario = numHor * salHor;
        
        System.out.printf("Número de cadastro: %d%n", numCadas);
        System.out.printf("Salário: %.2f%n", salario);
        
    }

}
