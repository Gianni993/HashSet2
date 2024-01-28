import java.util.HashSet;
import java.util.Set;

public class App {

/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato */

    public static void main(String[] args) {
       
      caricaHash();


    }


    public static void caricaHash(){

        Set<String> saluti = new HashSet<String>();

        saluti.add("ciao");
        saluti.add("hello");
        saluti.add("hallo");
        saluti.add("saluton");
        saluti.add("hola");
        saluti.add("ciao");

        String saluto = "arrivederci";

        saluti.add(saluto);

        System.out.println("Esiste arrivederci: " + saluti.contains("arrivederci"));

    }
}
