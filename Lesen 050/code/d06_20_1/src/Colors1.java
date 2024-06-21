public enum Colors1 {
    GREEN (10, "зеленый"),
    BLACK (20, "черный"),
    RED (30, "красный"),
    BLUE(40, "синий");

    private int colorCode;
    private String title;

    public int getColorCode() {
        return colorCode;
    }

    public String getTitle() {
        return title;
    }

    Colors1(int colorCode, String title) {
        this.colorCode = colorCode;
        this.title = title;
    }
}
