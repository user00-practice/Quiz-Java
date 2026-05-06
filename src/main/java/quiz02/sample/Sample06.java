package quiz02.sample;

import common.Input;

/**
 * 小テスト第2回 対策
 * 問題6（Sample06）: 例外処理を追加した完成版
 *
 * 実行結果（y=0 のとき）:
 * 0による割り算はできません
 */
public class Sample06 {
    public static void main(String[] args) {
        int x = Input.getInt();
        int y = Input.getInt();
        try {
            int ans = div(x, y);
            System.out.println(x + "÷" + y + "＝" + ans);
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
