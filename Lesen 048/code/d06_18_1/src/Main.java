import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            Writer fr = new FileWriter("1.txt");
            fr.write("hello java!!! Привет джава!");
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            OutputStream fr = new FileOutputStream("2.txt");
            fr.write("hello java!!! Привет джава!".getBytes());
            fr.write(67);
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        char[] arr = new char[30];
        try {
            Reader fr = new FileReader("1.txt");
            fr.read(arr);
            System.out.println(Arrays.toString(arr));
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] arr1 = new byte[50];
        try {
            InputStream fr = new FileInputStream("1.txt");
            fr.read(arr1);
            System.out.println(Arrays.toString(arr1));
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}