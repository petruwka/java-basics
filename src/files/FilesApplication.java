package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesApplication {

    public static void main(String[] args) throws IOException {

        // Windows \
        // Unix /
        File file = new File("C:\\Users\\itacademy\\Downloads\\Homework5_\\itac\\src\\test.txt");

//        Path path = file.toPath();

        System.out.println("Directory: " + file.isDirectory());
        System.out.println("File: " + file.isFile());

        if (!file.exists()) {
            boolean created = file.createNewFile();
            System.out.println("Created: " + created);
        }

        Scanner scanner = new Scanner(file);
        String firstLine = scanner.nextLine();
        System.out.println(firstLine);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }


//        file.

    }
}
