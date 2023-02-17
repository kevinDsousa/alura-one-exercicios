public class App {
    public static void main(String[] args) throws Exception {
        Funcionario nico = new Funcionario();
        nico.setSalario((260.00));
        System.out.println(nico.getNome());
        
        Gerente kevin = new Gerente();
        kevin.setNome("kevin diego da silva");
        kevin.setSalario(3500);
        System.out.println(kevin.getBonificacao());
    }
}
