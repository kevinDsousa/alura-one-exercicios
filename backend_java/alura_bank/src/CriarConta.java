public class CriarConta {
    public static void main(String[] args) {
        Conta primeira_conta = new Conta();
        primeira_conta.saldo = 200;
        System.out.println(primeira_conta.saldo);

        primeira_conta.saldo += 100;
        System.out.println(primeira_conta.saldo);

        Conta segunda_conta = new Conta();
        segunda_conta.saldo = 50;

        System.out.println("primeira conta tem " + primeira_conta.saldo);
        System.out.println("segunda conta tem " + segunda_conta.saldo);

        System.out.println(primeira_conta.agencia);
        System.out.println(segunda_conta.agencia);
    }
}
