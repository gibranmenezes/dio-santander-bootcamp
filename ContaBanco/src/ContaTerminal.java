import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Digite número da agência: ");
        String agencia = input.nextLine();
        System.out.print("Digite número da conta: ");
        int numero = input.nextInt();        
        input.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String cliente = input.nextLine();
        System.out.print("Digite o saldo da conta: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        input.close();
    }
}
