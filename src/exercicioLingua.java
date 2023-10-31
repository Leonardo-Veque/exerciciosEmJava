import java.util.Locale;
import java.awt.*;

public class exercicioLingua {
    static void resolucao() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);

    }

    public static void main(String[] args) {
        Locale language = Locale.getDefault();
        System.out.println(language.getDisplayLanguage());
        System.out.println(language.toString());

        resolucao();
    }

}
