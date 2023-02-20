public class ControlerBonificacao {
    private double soma;

    public void registro(Funcionario g) {
        double bonificacao = g.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
