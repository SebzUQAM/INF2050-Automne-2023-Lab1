package exercice2;

import java.io.IOException;

public class LireTitre {
    public static void AfficherTitres(){
        try {
            String livres = Utf8File.loadFileIntoString("livres.txt");
            System.out.println(livres);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
