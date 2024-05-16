public class Email implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("набрали письмо и отправили email");
    }

    @Override
    public String getServiceName() {
        return "Email";
    }
}
