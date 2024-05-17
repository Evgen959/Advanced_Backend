public class GetEmail implements PersonToStringFunction{
    @Override
    public String apply(Person person) {
        return person.getEmail();
    }
}
