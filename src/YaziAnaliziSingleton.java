public class YaziAnaliziSingleton {

    private static final Sozluk turkce = new Sozluk("Türkçe");
    public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();

    private YaziAnaliziSingleton()
    {

    }

    public static boolean isValid()
    {
        return  true;
    }
}
