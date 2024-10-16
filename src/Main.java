import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(new Sozluk("Türkçe"));

        System.out.println(asd.isValid());

        Supplier<String> fs =  () -> "Toprak";

        fs.get();
        Supplier<Integer> fs2 = () -> 10;

        System.out.println(fs2.get());




    }
}