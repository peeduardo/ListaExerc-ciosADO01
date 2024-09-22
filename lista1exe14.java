import java.util.Scanner;
public class lista1exe14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos dividir dois valores sendo maior para o menor. ");
        
        System.out.println("Insira o primeiro valor: ");
        double n1 = input.nextDouble();
        
        System.out.println("Insira o segundo valor: ");
        double n2 = input.nextDouble();

        if (n1 > n2){
            double div1 = n1 / n2;
            System.out.println("A divisão considerando n1 > que n2, é de: " + div1); 
        } else if (n2 > n1){
            double div2 = n2 / n1; 
            System.out.println("A divisão considerando n2 > n1, é de: " + div2 );
        } else{
            System.out.println("Os valores são iguais. Não é possível calcular.");
        }
    }
}
