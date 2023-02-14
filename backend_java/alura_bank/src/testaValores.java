public class testaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(50, 55);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(14, 526);
        System.out.println(conta2.getAgencia());

        System.out.println(Conta.getTotal());

    }
}
