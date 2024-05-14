public class AddBrecketsTransformer extends Transformer{

    @Override
    public String transform (String str){
        str = "[" + str + "]";
        return str;
    }
}
