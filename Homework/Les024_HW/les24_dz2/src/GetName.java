public class GetName implements PersonToStringFunction{
    @Override
    public String apply(Person person) {
        return person.getLastName() + "  " + person.getFirstName();
    }
}
