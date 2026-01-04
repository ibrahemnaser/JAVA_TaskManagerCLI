import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileHandler {
    MyFileHandler(){
        this.readFileStream();
    }

    public void readFileStream(){
        String path = "./src/data.txt";
        // FileInputStream >> read binary data (stream)
        // auto closable stream resource
        try (FileInputStream fis = new FileInputStream("./src/data.txt")){
             // fis.read() >> returns code (byte)
            // use loop
//            int output;
//            while(( output= fis.read()) != -1){
//                System.out.print((char)output);
//            }
//            System.out.println("\nOu::: "+output);
//            System.out.println(' ');

            // fis.read(byte) >> returns code (byte) and save inside byte array
            byte [] b = new byte[(int) new File(path).length()]; // array of bytes (dynamic)
//            byte [] b = new byte[5]; // array of bytes
            fis.read(b);

            String outp= new String(b);
            System.out.println(outp);
            for (byte charByte: b){
                System.out.println((char)charByte);

            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
