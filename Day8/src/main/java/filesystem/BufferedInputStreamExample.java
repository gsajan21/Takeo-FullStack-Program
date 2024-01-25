package filesystem;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class BufferedInputStreamExample {
    static void method() throws IOException {
        File file = new File("src/main/java/filesystem/javafilesystem.txt");
        System.out.println(file.isFile());
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
        System.out.println();
        int read;
        while((read = input.read()) != -1){
            System.out.print(((char) read));
        }

    }

    public static void main(String[] args) throws IOException{
        method();
    }
}
