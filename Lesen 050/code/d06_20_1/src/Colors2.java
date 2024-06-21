public enum Colors2 {
    GREEN (10, "зеленый"){
        @Override
        public void method(){
            System.out.println("green green");
        }
    },
    BLACK (20, "черный"){
        @Override
        public void method(){
            System.out.println("black black");
        }
    },
    RED (30, "красный"){
        @Override
        public void method(){
            System.out.println("red red");
        }
    },
    BLUE (40, "синий"){
        @Override
        public void method(){
            System.out.println("blue blue");
        }
    };

    private int colorCode;
    private String title;

    public int getColorCode() {
        return colorCode;
    }

    public String getTitle() {
        return title;
    }

    Colors2(int colorCode, String title) {
        this.colorCode = colorCode;
        this.title = title;
    }

    public abstract void  method();
}
