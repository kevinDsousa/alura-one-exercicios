public class TestaMedoto {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(150);

        conta.saca(20);
        System.out.println(conta.saldo);

        Conta novaConta = new Conta();
        novaConta.depositar(1000);
        if(novaConta.transfere(300, conta)) {
            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        };

        System.out.println(novaConta.saldo);
        System.out.println(conta.saldo);

        Cliente kevin = new Cliente();
        kevin.nome = "kevin diego";
        kevin.cpf = "0575749300";
        kevin.profissao = "analista";

        Conta contaKevin = new Conta();
        contaKevin.depositar(100);

        contaKevin.titular = kevin;
        System.out.println(contaKevin.titular.nome);

    }
}
