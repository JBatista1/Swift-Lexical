/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.io.File;
/**
 *
 * @author joao batista
 */
public class Principal {
    
    public static void main(String[] args) {
        String path = "src/codigo/";
        String arquivo = path + "Lexer.flex";
        generateLexex(arquivo);
    }
    public static void generateLexex(String ruta) {
        File archive = new File(ruta);
        JFlex.Main.generate(archive);
    }
}
