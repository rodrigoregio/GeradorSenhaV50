package top.rregio.GeraSenhaV50.logica;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Save2File {
    public static void append2File(String text) throws IOException{
        FileWriter file=new FileWriter("./pass.txt",true);
        file.write(text);
        file.close();
        JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!", 
                "Arquivo salvo", JOptionPane.INFORMATION_MESSAGE);
    }
}
