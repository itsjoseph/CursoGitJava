import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) throws Exception {
        FileInputStream archivo = new FileInputStream("src/config.properties");
        Properties prop = new Properties(System.getProperties());
        prop.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
        System.setProperties(prop);
        System.getProperties().list(System.out);
        prop.load(archivo);
    }
}
