import java.util.Scanner;
public class AtividadesPesoIdeal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = teclado.nextDouble();

        System.out.print("Digite o sexo (M para masculino / F para feminino): ");
        char sexo = teclado.next().toUpperCase().charAt(0);

        double pesoIdeal;
        
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para homem é: " + pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para mulher é: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Use M ou F.");
        }
    }
}
