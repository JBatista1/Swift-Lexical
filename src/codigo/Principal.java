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
        String path = "C:/Users/joao batista/Documents/NetBeansProjects/AnalisadorLexicoSwift/src/codigo/Lexer.flex";
        generateLexex(path);
    }
    public static void generateLexex(String ruta) {
        File archive = new File(ruta);
        JFlex.Main.generate(archive);
    }
}
