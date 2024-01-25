package filesystem;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    static void method() throws IOException {
        File file = new File("src/main/java/filesystem/javafilesystem.txt");
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
        String s = "Hello World. This is a newly created file system.";

        output.write(s.getBytes());
        output.close();


    }

    public static void main(String[] args) throws IOException{
        method();
    }
}
