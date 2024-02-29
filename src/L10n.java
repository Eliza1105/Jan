import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class L10n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chouse language: ");
int language = scanner.nextInt();
Locale locale = null;
switch (language) {
    case 0: locale = new Locale("ru", "Ru");
    case 1: locale = new Locale("de", "DE");

}
        ResourceBundle bundle = ResourceBundle.getBundle("L10n", locale);
        System.out.println(bundle.getString("key"));
    }
}
