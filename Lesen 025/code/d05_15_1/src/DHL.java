public class DHL implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("Покупаем конверт и марку");
        System.out.println("Упаковываем письмо");
        System.out.println("Бегом на почту");
    }

    @Override
    public String getServiceName() {
        return "DHL";
    }
}
