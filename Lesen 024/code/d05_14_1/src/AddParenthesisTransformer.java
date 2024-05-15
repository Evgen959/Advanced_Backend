public class AddParenthesisTransformer extends Transformer{
    @Override
    String transform(String str) {
        return  "(" + str + ")";
    }

    @Override
    String getTransformationDescription() {
        return "добавили круглые скобки";
    }
}
