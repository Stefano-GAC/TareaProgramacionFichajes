import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /** Creacion de objetos de la clase Presidente */
        Presidente presidente1 = new Presidente("123456789A", "Carlos Martinez");
        Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez");
        Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez");

        /** Creacion de la lista de presidentes */
        ArrayList<Presidente> presidentes = new ArrayList<>();
        presidentes.add(presidente1);
        presidentes.add(presidente2);
        presidentes.add(presidente3);
    }
}
