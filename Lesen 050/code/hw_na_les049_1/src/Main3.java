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

public class Main3 {
    public static void main(String[] args) {
        String inputFile = "../file.dat";

        int[] filesSize = {601,57053,22494};
        File inputData = new File(inputFile);
        if (!inputData.exists()){
            System.out.println("Отсутствует файл данных");
            System.exit(-1);
        }
        int sizeAll = filesSize[0]+filesSize[1]+filesSize[2];
        if (inputData.length()<sizeAll){
            System.out.println("Не верный формат файла данных");
            System.out.println(-1);
        }
        String[] outputFile = {
                "../test_temp/file1",
                "../test_temp/file2",
                "../test_temp/file3"
        };

        try (FileInputStream inputStream = new FileInputStream(inputFile)) {

            for (int i = 0; i < 3; i++) {
                readPart(filesSize, outputFile, i, inputStream);
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }

    private static void readPart(int[] filesSize, String[] outputFile, int index, FileInputStream inputStream) {
        try (OutputStream os = new FileOutputStream(outputFile[index])) {
                byte[] buffer = new byte[filesSize[index]];
                int bytes = inputStream.read(buffer);
                if (bytes== filesSize[index]){
                    os.write(buffer, 0, bytes);
                } else {
                    System.out.println("Ошибка чтения [" + (index +1) + "] части");
                }
            }catch (IOException e) {
                System.out.println("Ошибка записи [" + (index +1) + "] части");
            }
    }
}