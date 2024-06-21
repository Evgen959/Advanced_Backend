/* В одном из этих файлов лежит gif картина, в другом jpg картинка,
еще в одном скомпилированный .class файл java программы. Вам нужно написать программу,
которая определит, в каком файле что лежит. Сделать это можно используя так называемые сигнатуры файлов:
gif должен начинаться с шестнадцатеричной  последовательности байт 47 49 46 38 39 61
jpeg с последовательности ff d8   java .class файл с шестнадцатеричной  последовательности ca fe ba be
Сохраните файл, опознанный как .class файл под именем Main.class и запустите его из командной строки.
Прочитайте кодовое слово.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rr = 077;
        byte[] arr = {(byte) 0x47, (byte) 0x49, (byte)0xff};
        int b = Integer.parseInt("ff", 16);
        System.out.println(b);
        //System.out.println(arr[2]);
        System.out.println(rr);

        String s="0011 1011 0101 0001 0010 1010";

        try(Scanner scanner = new Scanner(new File("1.txt"));) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintStream ps = new PrintStream(new File("3.txt"))) {
            ps.println("hello java");
            ps.println("- print stream -");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}