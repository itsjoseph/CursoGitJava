import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = System.getProperties();

        String username = System.getProperty("user.name");
        System.out.println(username);

        String workspace = System.getProperty("user.dir");
        System.out.println(workspace);

        String java = System.getProperty("java.version");
        System.out.println(java);

        String line = System.getProperty("line.separator");
        System.out.println(line);

        System.out.println(System.getProperty("os.name"));

        props.list(System.out);
    }
}