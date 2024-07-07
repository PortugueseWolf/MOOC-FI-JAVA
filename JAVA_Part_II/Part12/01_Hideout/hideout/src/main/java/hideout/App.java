package hideout;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hideout<String> test = new Hideout<>();
        test.putIntoHideout("test");
        System.out.println(test.isInHideout());
        test.takeFromHideout();
        System.out.println(test.isInHideout());

    }
}
