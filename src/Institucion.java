/**
 *
 * @author jmari
 */
public class Institucion {
    
    private static Institucion institucion;
    
    private Institucion() {}
        
    public synchronized static Institucion getInstitucion() {
        
        if (institucion == null) {
            institucion = new Institucion();
        }
        return institucion;
    }
}