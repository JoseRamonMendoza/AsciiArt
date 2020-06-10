package asciiart;

/**
 *Clase que fungirá como controlador utilizando el patrón strategy para cambiar
 * entre fuentes
 * @author jr199
 */
public class FontManager {
    public static Fuente EscogerFont(int fontChoosed){
        Fuente font = new Asterisco();
        switch(fontChoosed){
            case 0:
                font = new Asterisco();
            
        }
        
        return font;
    }
    
}