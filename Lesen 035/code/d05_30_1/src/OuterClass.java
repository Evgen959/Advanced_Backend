public class OuterClass {
    private int outterX;

    class InnerClass{
        private int innerX;

        public InnerClass(int innerX) {
            this.innerX = innerX + outterX;
        }

        public int getInnerX() {
            return innerX;
        }

        public void setInnerX(int innerX) {
            this.innerX = innerX;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "innerX=" + innerX +
                    '}';
        }
    }

    public OuterClass(int outterX) {
        this.outterX = outterX;
    }

}
class Demo{

}


