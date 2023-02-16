public class App {
    public static void main(String[] args) throws Exception {
        Funcionario nico = new Funcionario("nico silva", "05745749330");
        nico.setSalario((260.00));
        System.out.println(nico.getNome());
    }
}
