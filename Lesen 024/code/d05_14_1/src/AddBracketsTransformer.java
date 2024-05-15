public class AddBracketsTransformer extends Transformer {

    @Override
    public String transform(String str) {
        str = "[" + str + "]";
        return str;
    }

    @Override
    String getTransformationDescription() {
        return "добавили квадратные скобки";
    }

}
