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

public class Main2 {
    public static void main(String[] args) {
        String inputFile = "../file.dat";

        File inputData = new File(inputFile);
        if (!inputData.exists()){
            System.out.println("Отсутствует файл данных");
            System.exit(-1);
        }

        String[] outputFile = {
                "../test_temp/file1",
                "../test_temp/file2",
                "../test_temp/file3"
        };

        int[] filesSize = {601,57053,22494};

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream1 = new FileOutputStream(outputFile[0]);
             FileOutputStream outputStream2 = new FileOutputStream(outputFile[1]);
             FileOutputStream outputStream3 = new FileOutputStream(outputFile[2]);
        ) {
            OutputStream[] os = {outputStream1,outputStream2,outputStream3};

            for (int i = 0; i < 3; i++) {
                byte[] buffer = new byte[filesSize[i]];
                int bytes = inputStream.read(buffer);
                if (bytes!=-1){
                    os[i].write(buffer, 0, bytes);
                }
            }
            /*byte[] buffer = new byte[filesSize[0]];
            int bytes = inputStream.read(buffer);
            if (bytes!=-1){
                os[0].write(buffer, 0, bytes);
            }
            buffer = new byte[filesSize[1]];
            bytes = inputStream.read(buffer);
            if (bytes!=-1){
                os[1].write(buffer, 0, bytes);
            }
            buffer = new byte[filesSize[2]];
            bytes = inputStream.read(buffer);
            if (bytes!=-1){
                os[2].write(buffer, 0, bytes);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}