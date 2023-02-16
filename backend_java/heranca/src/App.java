public class App {
    public static void main(String[] args) throws Exception {
        Funcionario nico = new Funcionario();
        nico.setSalario((260.00));
        System.out.println(nico.getNome());

        FuncionarioTest kevin = new FuncionarioTest();
        kevin.setTipo(0);
        kevin.setSalario(300.00);

        FuncionarioTest diego = new FuncionarioTest();
        diego.setTipo(1);
        diego.setSalario(500.00);

        System.out.println(kevin.getBonificacao());
        System.out.println(diego.getBonificacao());
        
    }
}
