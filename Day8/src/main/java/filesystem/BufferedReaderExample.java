package filesystem;


import java.io.*;

public class BufferedReaderExample {
    static void method() throws IOException {
        File file = new File("src/main/java/filesystem/javafilesystem.txt");
        System.out.println(file.isFile());
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        String s;
        while((s = reader.readLine()) != null){
            System.out.println(s);
        }

    }
    public static void main(String[] args) throws IOException {
        method();
    }
}
