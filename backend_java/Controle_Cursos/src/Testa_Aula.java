import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testa_Aula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Trabalhando com listas e objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas); // comparanto alfabeticamente

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); //Comparanto por tempo

        aulas.sort(Comparator.comparing(Aula::getTempo)); // Compara tambem por tempo so que mais limpo a escrita
        
    }
}
