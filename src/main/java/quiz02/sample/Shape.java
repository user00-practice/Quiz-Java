package quiz02.sample;

/**
 * 小テスト第2回 対策
 * 問題1: 抽象クラス Shape
 */
public abstract class Shape {
    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor()            { return color; }
    public void   setColor(String color){ this.color = color; }

    public abstract String getName();
    public abstract double area();
}
