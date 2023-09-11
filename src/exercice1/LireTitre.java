package exercice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LireTitre {
    public static void AfficherTitres(){
        try {
            File file = new File("livres.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
