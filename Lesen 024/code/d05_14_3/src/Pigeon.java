public class Pigeon implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("Голубь?! В 21 веке?! Ты крэзи!!");
    }

    @Override
    public String getServiceName() {
        return "Голубь";
    }
}
