import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class MyFileHandler {
    MyFileHandler() {
//        this.readFileStream();
//        this.writeFileStream();
//        this.readWrtieImage();
//        this.handleFiles();
//        this.handleBufferedFiles();
        this.handlePrintFiles();
        this.handleScannerFiles();
    }

    public void handleScannerFiles() {
//        USER FOR Reading Files
        File f = new File("play.txt");
        if (f.exists()) {
            try (Scanner scn = new Scanner(new FileReader(f));) {
                System.out.println("Scanner::: START");
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    System.out.println(line);
                    String [] spl = line.split(", ");
                    System.out.println("*******");
                    System.out.println(spl[0]);
                    System.out.println(spl[1]);
                    System.out.println(spl[2]);
                    System.out.println(spl[3]);
                    System.out.println(spl[4]);
//                    for (String val:spl){
//                        System.out.println(val);
//                    }
                    System.out.println("*******");
                }
                System.out.println("Scanner::: END");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }


    public void handlePrintFiles() {
//        MOST USED FOR Writing Files
//        Print String, int, double, float, boolean, char
        File f = new File("play.txt");
        if (f.exists()) {
            try (PrintWriter pwr = new PrintWriter(new FileWriter(f, true), true);) {
                pwr.println("ID: " + 23 + ", Name: " + "Hassan" + ", Age: " + 44 + ", Salary: " + 23300.24 + ", Married: " + true);
                pwr.println("ID: " + 25 + ", Name: " + "Mona" + ", Age: " + 40 + ", Salary: " + 13233.23 + ", Married: " + false);
                pwr.println("ID: " + 27 + ", Name: " + "Wael" + ", Age: " + 33 + ", Salary: " + 28546.25 + ", Married: " + true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void handleBufferedFiles() {
        File f = new File("play.txt");
        if (f.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                 BufferedReader bfr = new BufferedReader(new FileReader(f))) {
                bw.write("New Buffered");
                bw.newLine();
                bw.write("Second");
                bw.newLine();
                bw.write(102);
                bw.newLine();
                System.out.println("Success");
                String line;
                while ((line = bfr.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("Read Finish");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                System.out.println("newFile_creation: " + f.createNewFile());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }


    public void handleFiles() {
        File f = new File("play.txt");
        System.out.println("Is-exist: " + f.exists());

        if (f.exists()) {
            try (FileWriter fr = new FileWriter(f, true); FileReader frd = new FileReader(f);) {
                fr.append("PLAY AGAIN\n");
                fr.append("And EAT\n");
                fr.append("And SLEEP\n");
                fr.append("Please Don't Remove\n");
                fr.write(98);
                fr.write('\n');
                System.out.println("WRITE SUCCESSFULLY!!");

                char[] fileContent = new char[(int) f.length()];
                frd.read(fileContent);
                System.out.println("File Content: \n");
                for (char c : fileContent) {
                    System.out.print(c);
                }
                System.out.println('\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(f.getAbsolutePath());
            System.out.println(f.length());
        } else {
            try {
                boolean newFile = f.createNewFile();
                System.out.println("newFile_creation: " + newFile);
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }

    public void readWrtieImage() {
        String srcPath = "./src/img1.png";
        String outPath = "./src/img2.png";

        try (FileInputStream fis = new FileInputStream(srcPath); FileOutputStream fos = new FileOutputStream(outPath)) {
            byte[] b = new byte[(int) new File(srcPath).length()];

            fis.read(b); // [1]- read image binary
            // print the binary result
//            for (byte chr: b){
//                System.out.print((char)chr);
//            }

            // [2]- write it to new destination
            fos.write(b);

        } catch (Exception e) {
            System.out.println("E: " + e);

        }
    }

    public void writeFileStream() {
        String path = "./src/test.txt";

        try (FileOutputStream fos = new FileOutputStream(path)) {
            System.out.println("Write to file <int | byte[]>");

            fos.write(97); // byte integer >> 97:'a'

            fos.write("\nHEllo\n".getBytes()); // array of bytes
            fos.write("حسن الهلالي".getBytes("UTF-8")); // array of bytes >> "UTF-8" for arabic
            fos.flush(); // >> ensure that all data is passed correctly to the file
        } catch (FileNotFoundException fne) {
            System.out.println("File Not Found: " + fne);
        } catch (IOException ioe) {
            System.out.println("I/O: " + ioe);
        }
    }

    public void readFileStream() {
        String path = "./src/data.txt";
        // FileInputStream >> read binary data (stream)
        // auto closable stream resource
        try (FileInputStream fis = new FileInputStream("./src/data.txt")) {
            // fis.read() >> returns code (byte)
            // use loop
//            int output;
//            while(( output= fis.read()) != -1){
//                System.out.print((char)output);
//            }
//            System.out.println("\nOu::: "+output);
//            System.out.println(' ');

            // fis.read(byte) >> returns code (byte) and save inside byte array
            byte[] b = new byte[(int) new File(path).length()]; // array of bytes (dynamic)
//            byte [] b = new byte[5]; // array of bytes
            fis.read(b);

            String outp = new String(b);
            System.out.println(outp);
            for (byte charByte : b) {
                System.out.println((char) charByte);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
