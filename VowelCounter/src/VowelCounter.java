import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Kyle on 9/10/2014.
 */
public class VowelCounter {
    private ArrayList characterArray = new ArrayList(100);
    public static void main(String[] args) {
        VowelCounter vowelCounter = new VowelCounter();
    }

    public void readWebpage() throws IOException{
        URL url = new URL("http://lipsum.com/");
        BufferedReader webReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while (webReader.readLine() != null) {
            inputLine = webReader.readLine().toString().trim();
        }
    }
}
