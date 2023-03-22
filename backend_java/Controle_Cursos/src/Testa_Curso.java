
public class Testa_Curso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        javaColecoes.adiciona((new Aula("Trabalhando com ArrayList", 21)));
        javaColecoes.adiciona((new Aula("Criando uma aula", 15)));
        javaColecoes.adiciona((new Aula("Modelando com coleções", 22)));

        System.out.println(javaColecoes.getAulas());
        
    }
}
