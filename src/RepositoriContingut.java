import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RepositoriContingut {
    // TOTA AQUELLA FUNCIONS RELACIONADES AMB EL CONTINGUT DELS FITXERS PATH I FILES -- LLEGIR I ESCRIURE


    public List<String> llegirFitxer(Path fitxer, boolean isHeader) throws IOException {
        List<String> contingut = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(fitxer, StandardCharsets.UTF_8)) {
            String linia;
            if(!isHeader){linia = br.readLine()}
            while ((linia = br.readLine()) != null) {  
                contingut.add(linia);
            }
        }
        return contingut;
        
    }

    public void escriureFitxer(Path fitxer, List<String> contingut) {
        
    }
}
