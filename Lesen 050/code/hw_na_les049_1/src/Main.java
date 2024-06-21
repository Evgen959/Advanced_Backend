/*По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing
находится файл file.dat . Сохраните этот файл  на диск (просто “ручками”, не из программы).
Ваша программа  должна записать в отдельный файл первые 601 байт,
затем в отдельный файл записать следующие 57053 байта
и оставшиеся 22494 байта записать в следующий файл. Если все сделано правильно,
у вас должно получиться 3 файла.
       В одном из этих файлов лежит gif картина, в другом jpg картинка,
еще в одном скомпилированный .class файл java программы. Вам нужно написать программу,
которая определит, в каком файле что лежит. Сделать это можно используя так называемые сигнатуры файлов:
gif должен начинаться с шестнадцатеричной  последовательности байт 47 49 46 38 39 61
jpeg с последовательности ff d8   java .class файл с шестнадцатеричной  последовательности ca fe ba be
Сохраните файл, опознанный как .class файл под именем Main.class и запустите его из командной строки.
Прочитайте кодовое слово.*/


import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "../file.dat";

        String outputFile1 = "../test_temp/file1.dat";
        String outputFile2 = "../test_temp/file2.dat";
        String outputFile3 = "../test_temp/file3.dat";

        int file1Size = 601;
        int file2Size = 57053;
        int file3Size = 22494;

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream outputStream2 = new FileOutputStream(outputFile2);
             FileOutputStream outputStream3 = new FileOutputStream(outputFile3);
        ) {
            byte[] buffer = new byte[file1Size];
            int bytes = inputStream.read(buffer);
            if (bytes!=-1){
                outputStream1.write(buffer, 0, bytes);
            }

            buffer = new byte[file2Size];
            bytes = inputStream.read(buffer);
            if (bytes!=-1){
                outputStream2.write(buffer, 0, bytes);
            }

            buffer = new byte[file3Size];
            bytes = inputStream.read(buffer);
            if (bytes!=-1){
                outputStream3.write(buffer, 0, bytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}