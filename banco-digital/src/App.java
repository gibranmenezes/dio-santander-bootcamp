import domain.Banco;
import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Conta ccJoao = new ContaCorrente(new Cliente("joao"));
        Conta cpJoao = new ContaPoupanca(new Cliente("joao"));
        Conta cpAna = new ContaPoupanca(new Cliente("ana"));
        Conta ccAna = new ContaCorrente(new Cliente("ana"));
      


        ccJoao.depositar(100.55);
        ccJoao.transferir(50.42, cpAna);

        ccJoao.imprimirExtrato();
        cpAna.imprimirExtrato();

      
        System.out.println(Banco.getClientes());
    }
}
