public class FuncionarioTest {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;
    private int senha;

    public double getBonificacao() {
        if(this.tipo == 0) {
            return this.salario * 0.1;
        }
        else if(this.tipo == 1) {
            return this.salario + 500;
        }
        else {
            return this.salario + 1000;
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
