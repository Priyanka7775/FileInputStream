import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextAnalyzer {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer=new TextAnalyzer();
        String fileData= textAnalyzer.readFile("resource/poem.txt");
        System.out.println( fileData);
    }
    public String readFile(String poemFileName){
        String response="";
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(poemFileName);
            int data=0;
            while ((data = fileInputStream.read())!= -1){
            char readData=(char)data;
            response= response+readData;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
           e.printStackTrace();
            System.out.println("e = " + e);
        }
        return response;
    }

}
