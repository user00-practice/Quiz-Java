package sample11;

/**
 * 小テスト第2回 対策
 * 問題2: Shape を継承した Rectangl クラス
 */
public class Rectangl extends Shape {
    private double width;
    private double height;

    public Rectangl(String color, double width, double height) {
        super(color);
        this.width  = width;
        this.height = height;
    }

    public double getWidth()             { return width; }
    public void   setWidth(double width) { this.width = width; }
    public double getHeight()            { return height; }
    public void   setHeight(double height){ this.height = height; }

    @Override
    public String getName() { return "四角形"; }

    @Override
    public double area() { return width * height; }
}
