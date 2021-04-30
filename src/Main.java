/**
 *
 * @author jmari
 */
public class Main {
    
    public static void main(String[] args) {
        
        Institucion estudiante1 = Institucion.getInstitucion();
        System.out.println(estudiante1.hashCode());
        
        Institucion estudiante2 = Institucion.getInstitucion();
        System.out.println(estudiante2.hashCode());
        
        Institucion estudiante3 = Institucion.getInstitucion();
        System.out.println(estudiante3.hashCode());
    }
}