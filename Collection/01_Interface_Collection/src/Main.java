import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("como");
        lista.add("estas");
        for (String i:lista
             ) {
            System.out.println(i);

        }
        System.out.println("---------------------------->");

        Collection<String> lista2 = new ArrayList<>();
        lista2.add("new1");
        lista2.add("new2");
        lista2.add("new3");

        lista.addAll(lista2);
        for (String i: lista
             )
            System.out.println(i); {
        }
    }
}