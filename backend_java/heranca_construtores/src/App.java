public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente(144, 200);
        conta.depositar(100.0);

        ContaPoupanca contaP = new ContaPoupanca(222, 333);
        contaP.depositar(200.0);

        conta.transfere(10, contaP);
        conta.saca(50);

        System.out.println(conta.getSaldo());
        System.out.println(contaP.getSaldo());
    }
}
