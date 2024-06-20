import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (OutputStream outputStream = new FileOutputStream("1")) { // освобождает ресур
                                                                            // в любом случае
            outputStream.write(65);
            outputStream.write(66);
            outputStream.write(67);
            outputStream.write(10);
            //outputStream.write(13);
            outputStream.write(65);
            outputStream.write(66);
            outputStream.write(67);
            //outputStream.close(); // освобождает ресур
        } catch (IOException e) {
            System.out.println("Что-то пошло не так ......");
        }


        try (InputStream is = new FileInputStream("1")) {
            int data;
            while ((data= is.read())!=-1){
                System.out.printf("%d", data);
            }
        }catch (IOException e){

        }
    }
}