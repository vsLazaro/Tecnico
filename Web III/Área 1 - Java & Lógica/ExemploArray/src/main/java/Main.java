import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("aaaaaaaa");

        Set<String> nomes = new HashSet<>();

        nomes.add("fernando");
        nomes.add("felipe");
        nomes.add("Ofélia");
        nomes.add("Danny");


        System.out.println(nomes.stream().filter(nome ->  nome.contains("f")).collect());
    }
}
