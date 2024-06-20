import java.io.*;
                            // Работа с файлом (копирование массивом байтов)
public class Main3 {
    public static void main(String[] args) {

        copy();
    }

    public static void copy(){
        try (InputStream is = new FileInputStream("../1.mp4");
             OutputStream os = new FileOutputStream("../1copy.mp4")) {
            int size = 1024*1024*10;
            byte[] data = new  byte[size]; // буферный массив
            int count =0;

            while ((count= is.read(data))!=-1){
                System.out.println(count);
                if (count<size){ //если буферный массив не заполнился полностью.
                    os.write(data, 0, count); // записываем заполненую часть массива
                }else {
                    os.write(data);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
