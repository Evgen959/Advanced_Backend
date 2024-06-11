public class MyPredicateImpl implements MyPredicate{

    @Override
    public boolean test(Person person) {
        return person.getAge()>18;
    }
}
