import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MailDeliveryService[] services = {
                new DHL(),
                new Email(),
                new Pigeon(),
                new UPS()
        };
        boolean isContinue = true;
        while (isContinue) {
            MailDeliveryService service = selectService(services);
            if (service != null) {
                sendMail(service);
            }
            isContinue = isContinue();
        }
    }

    public static boolean isContinue(){
        System.out.println("5 - выход, любая цифра - продолжаем");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt()==5? false:true);
    }

    public static MailDeliveryService selectService (MailDeliveryService[] service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ доставки почты:");
        for (int i = 0; i < service.length; i++) {
            System.out.println(i + " " + service[i].getServiceName());
        }
        int choice = scanner.nextInt();
        if (choice < 0 || choice >= service.length) {
            return  null;
        }else {
            return service[choice];
        }

    }

    public static void sendMail(MailDeliveryService service){
        System.out.println("Подготовили письмо");
        System.out.println("отсылаем .........");
        service.deliveryMail();    // !!!!!!!!!!!
        System.out.println("Отослано!!!!");
    }
}