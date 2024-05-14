public class AddParennthesisTransformer extends Transformer {

    @Override
    String transform(String str){
        return "(" + str + ")";
    }
}
