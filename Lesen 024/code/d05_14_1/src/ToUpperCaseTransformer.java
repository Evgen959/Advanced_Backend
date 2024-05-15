public class ToUpperCaseTransformer extends Transformer{
    @Override
    String transform(String str) {
        return  str.toUpperCase();
    }

    @Override
    String getTransformationDescription() {
        return "всю строку заглавными буквами";
    }
}
