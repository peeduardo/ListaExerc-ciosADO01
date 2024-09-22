import java.util.Scanner;
public class lista1exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o seu nome:");
        String nome = input.nextLine();
        
        System.out.println("Insira o seu salário fixo: ");
        float salFix = input.nextInt();

        System.out.println("Insira valor total de vendas: ");
        float vendas = input.nextFloat();

        float comissao = vendas * 0.15f;

        float totalReceber = salFix + comissao;

        System.out.println("O total a receber no fim do mês é, juntando salário e comissão é: " + totalReceber);
    }

}
