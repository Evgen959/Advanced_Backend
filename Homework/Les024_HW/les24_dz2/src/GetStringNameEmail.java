public class GetStringNameEmail implements PersonToStringFunction{
    @Override
    public String apply(Person person) {
        return person.getFirstName() + " " + person.getLastName() + "; " + person.getEmail();
    }
}
