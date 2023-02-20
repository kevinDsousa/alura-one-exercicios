public class App {
    public static void main(String[] args) throws Exception {
        Funcionario nico = new Funcionario();
        nico.setSalario((260.00));
        System.out.println(nico.getNome());

        Funcionario f = new Funcionario();
        f.setSalario(1200);
        
        Gerente kevin = new Gerente();
        kevin.setNome("kevin diego da silva");
        kevin.setSalario(3500);

        EditorVideo edit = new EditorVideo();
        edit.setSalario(1500);

        ControlerBonificacao controle = new ControlerBonificacao();
        controle.registro(kevin);
        controle.registro(f);
        controle.registro(edit);

        System.out.println(controle.getSoma());
    }
}
