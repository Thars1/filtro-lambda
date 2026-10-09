import java.util.ArrayList;
import java.util.List;

public class FiltroLambda {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Bruno");
        lista.add("Carlos");
        lista.add("Amanda");
        lista.add("Beatriz");
        FiltroNome filtroNome = (nome) ->{
            return nome.startsWith("A");
        };
        lista.stream().filter(nome -> !filtroNome.testar(nome)).forEach(nome-> System.out.println(nome));
    }
}
