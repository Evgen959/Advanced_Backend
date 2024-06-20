import java.io.*;
                                    // Работа с файлом (копирование по одному байту)
public class Main2 {
    public static void main(String[] args) {
        copy();
    }

    public static void copy(){
        try (InputStream is = new FileInputStream("../1.mp4"); // читаем фаил
             OutputStream os = new FileOutputStream("../1copy.mp4")) { // создаем и записываем фаил
            int count =0;
            int data;
            while ((data= is.read())!=-1){
                count++;
                if (count%100000==0){
                    System.out.println(count);
                }
                os.write(data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
