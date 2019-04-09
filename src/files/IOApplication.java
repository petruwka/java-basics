package files;

import java.io.*;

public class IOApplication {

    public static void main(String[] args) throws IOException {

        writeData();

        //        fis.read()
    }


    private static void writeData() throws IOException {

        try (OutputStream os = new FileOutputStream("test333.txt")) {
            os.write(66);
            os.write(65);
            os.write(65);
            os.write(66);
        }

//        OutputStream os = null;
//        try {
//            os = new FileOutputStream("test444.txt");
//            os.write(66);
//            os.write(67);
//        } catch (IOException e) {
//            if (os != null) {
//                try {
//                    os.close();
//                } catch (IOException e1) {
//                    // error on close
//                }
//            }
//        }


    }

    private void readWithReader() throws IOException {

        Reader r = new FileReader("C:\\Users\\itacademy\\Downloads\\Homework5_\\itac\\src\\test.txt");

        char[] chars = new char[100];
        while (r.read(chars) != -1) {
            System.out.println(chars);
        }


//        int c;
//        while ((c = r.read()) != -1) {
//            System.out.println((char) c);
//        }

    }
}
