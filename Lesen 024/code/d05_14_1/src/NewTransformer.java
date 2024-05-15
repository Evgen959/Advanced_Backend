public class NewTransformer extends Transformer{
    @Override
    String transform(String str) {
        Transformer t=new AddParenthesisTransformer();
        return t.transform("!"+str+"!");
    }

    @Override
    String getTransformationDescription() {
        return "Добавляем (! + !)";
    }
}
