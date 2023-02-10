public class TesteReferencia {
    public static void main(String[] args) {
        Conta novaConta = new Conta();
        novaConta.saldo = 300;

        Conta segundaConta = novaConta;
        System.out.println(segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);

        System.out.println(novaConta.saldo);

        if(novaConta == segundaConta) {
            System.out.println("são iguais");
        }
    }
}
