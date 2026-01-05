import java.io.*;
import java.nio.CharBuffer;

public class MyFileHandler {
    MyFileHandler(){
//        this.readFileStream();
//        this.writeFileStream();
        this.readWrtieImage();
    }

    public void readWrtieImage(){
        String srcPath= "./src/img1.png";
        String outPath= "./src/img2.png";

        try(FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(outPath)){
            byte [] b = new byte[(int) new File(srcPath).length()];

            fis.read(b); // [1]- read image binary
            // print the binary result
//            for (byte chr: b){
//                System.out.print((char)chr);
//            }

            // [2]- write it to new destination
            fos.write(b);

        }catch (Exception e){
            System.out.println("E: "+e);

        }
    }

    public void writeFileStream(){
        String path= "./src/test.txt";

        try(FileOutputStream fos = new FileOutputStream(path)){
            System.out.println("Write to file <int | byte[]>");

            fos.write(97); // byte integer >> 97:'a'

            fos.write("\nHEllo\n".getBytes()); // array of bytes
            fos.write("حسن الهلالي".getBytes("UTF-8")); // array of bytes >> "UTF-8" for arabic
            fos.flush(); // >> ensure that all data is passed correctly to the file
        }catch(FileNotFoundException fne){
            System.out.println("File Not Found: "+fne);
        }catch(IOException ioe){
            System.out.println("I/O: " + ioe);
        }
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
