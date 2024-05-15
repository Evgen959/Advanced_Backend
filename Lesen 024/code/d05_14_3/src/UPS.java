public class UPS implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("пришел курьер");
    }

    @Override
    public String getServiceName() {
        return "UPS";
    }
}
