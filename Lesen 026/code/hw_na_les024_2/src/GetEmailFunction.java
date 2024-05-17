public class GetEmailFunction implements ToStringFunction{
    @Override
    public String apply(Person p) {
        return p.getEmail();
    }
}
