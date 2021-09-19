import br.com.scandura.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora teste = new Calculadora();

        System.out.println(teste.somar(5, 4));
        System.out.println(teste.subtrair(5,4));
        System.out.println(teste.multiplicar(5,4));
        System.out.println(teste.dividr(5,4));        
        
    }
}
