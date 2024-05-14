public abstract class Plant {
    private  int height = 0;
    public abstract int getDelta();
    public void grow(){
        height+=getDelta();
    }
    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                '}';
    }
}
