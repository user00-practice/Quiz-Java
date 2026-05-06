package sample11;

/**
 * 小テスト第2回 対策
 * 問題5: Shape / LotNumber の動作確認
 *
 * 実行結果:
 * 図形の名前：四角形
 * 図形の面積：15.0
 * ロット番号：Item Z010
 */
public class Sample05 {
    public static void main(String[] args) {
        Shape shp = new Rectangl("青", 5.0, 3.0);
        IO.println("図形の名前：" + shp.getName());
        IO.println("図形の面積：" + shp.area());

        LotNumber lot = new Item(10112, "AX-GP1");
        IO.println("ロット番号：" + lot.getLotNumber());
    }
}
