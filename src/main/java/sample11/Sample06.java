package sample11;

/**
 * 小テスト第2回 対策
 * 問題6（Sample06）: 例外処理を追加した完成版
 *
 * 実行結果（y=0 のとき）:
 * 0による割り算はできません
 */
public class Sample06 {
    public static void main(String[] args) {
        int x = Integer.parseInt(IO.readln("x = "));
        int y = Integer.parseInt(IO.readln("y = "));
        try {
            int ans = div(x, y);
            System.out.println(x + " ÷ " + y + " = " + ans);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("0による割り算はできません");
        }
    }
}
