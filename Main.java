package BTU;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("function.txt"));
        String line = null;
        List<String> lines=new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        System.out.println(lines.get(0));
        System.out.println(lines.get(lines.size()-1));
    }
}
