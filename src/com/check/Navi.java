package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Navi {

    public static void main(String[] args) throws IOException {
        String fileName = "String.txt";
        String keyword = "Ad";
        readFile(fileName, keyword);
    }

    public static void readFile(String fileName, String keyWord) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/value/"+fileName));
        try {
            String line = br.readLine();
            while (line != null) {
                if(line.toLowerCase().contains(keyWord.toLowerCase())){
                    System.out.println(line);
                }
                line = br.readLine();
            }
        } finally {
            br.close();
        }
    }

}
