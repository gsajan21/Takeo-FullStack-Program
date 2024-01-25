package filesystem;

import java.io.*;

public class FileSystemExample {

    static void method() throws IOException {
        File file = new File("src/main/java/filesystem/javafilesystem.txt");
        System.out.println(file.isFile());
        InputStream input = new FileInputStream(file);
        System.out.println();
        while(input.read() != -1){
            int read = input.read();
            System.out.print(((char) read));
        }

    }

    public static void main(String[] args) throws IOException{
        method();
    }
}
