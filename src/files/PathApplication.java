package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class PathApplication {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("C:\\Users\\itacademy\\Downloads\\Homework5_\\itac\\src\\test.txt");
        Path path2 = Paths.get("C:", "Users", "itacademy", "Downloads", "Homework5_", "itac", "src", "test.txt");

        System.out.println("Name count: " +        path1.getNameCount());

        Path otherFile = path1.resolve("other.file");// returns new path path1 + other.file
        System.out.println(otherFile);

        Path notExistent = Paths.get("afaf", "Adad", "as");

        System.out.println(path1.resolve(notExistent));

        System.out.println(Files.isDirectory(path1));
//        System.out.println(Files.createDirectory(Paths.get("new_dir")));

        List<String> strings = Files.readAllLines(path1);
        System.out.println(strings);

        Files.write(Paths.get("test_new.txt"), Arrays.asList("new hello world", "second line"), StandardOpenOption.APPEND);


    }
}
