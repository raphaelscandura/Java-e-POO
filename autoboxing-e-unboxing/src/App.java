import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
 
        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        int valor = idadeRef.intValue(); //Unboxing

        String s = args[0];

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
    }
}
