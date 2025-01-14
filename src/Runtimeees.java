import java.io.IOException;

public class Runtimeees {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process proceso;

        try{
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                proceso = runtime.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = runtime.exec("code");
            } else {
                proceso = runtime.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
