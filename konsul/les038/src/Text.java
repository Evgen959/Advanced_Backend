import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<String>{
    private String value; // Jack Jhn and Ann

    public Text(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Text:" + value;
    }

    public Iterator<String> iterator(){
        return new TextIterator();
    }

    class TextIterator implements Iterator<String>{
        String[] words = value.split(" ");
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex<words.length;
        }

        @Override
        public String next() {
            return words[currentIndex++];
        }

        @Override
        public void remove() {
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(currentIndex-1);
            value = String.join(" ", list);
            words = value.split(" ");
        }
    }
}
