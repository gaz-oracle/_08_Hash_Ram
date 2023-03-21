import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        cola.offer("1");
        cola.offer("2");
        cola.offer("3");
        cola.offer("4");
        cola.offer("5");
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());

        /*
        El método poll() de Queue Interface devuelve y elimina el elemento en la parte frontal del contenedor.
        Elimina el elemento en el contenedor. El método no arroja una excepción cuando la Cola está vacía,
         sino que devuelve un valor nulo .
         */

    }
}
/*
1.La interfaz Queue está presente en el paquete java.util y amplía la interfaz Collection
que se utiliza para contener los elementos que se van a procesar en orden FIFO
(primero en entrar, primero en salir). Es una lista ordenada de objetos cuyo uso se limita a
insertar elementos al final de la lista y eliminar elementos al principio de la lista, (es decir),
 sigue el principio FIFO o First-In-First- Out .
 */