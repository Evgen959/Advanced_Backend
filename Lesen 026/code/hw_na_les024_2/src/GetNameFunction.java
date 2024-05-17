public class GetNameFunction implements ToStringFunction{
    @Override
    public String apply(Person p) {
        return p.getFirstName() + "  " + p.getLastName();
    }
}
