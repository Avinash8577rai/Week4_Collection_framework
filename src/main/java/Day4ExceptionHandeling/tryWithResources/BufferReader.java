package Day4ExceptionHandeling.tryWithResources;
import java.io.*;

public class BufferReader {
    public static String readFiles(String fileName){
        try(BufferedReader br= new BufferedReader((new FileReader(fileName)))){
            return br.readLine();
        }
        catch(IOException e){
            System.out.println("Error reading files using try with Resource");
            return null;
        }
    }

    public static void main(String[] args) {
        String fileName= " ";
        String firstLine = readFiles(fileName);

        if(firstLine!= null){
            System.out.println("First Line: "+firstLine);
        }
    }


}
