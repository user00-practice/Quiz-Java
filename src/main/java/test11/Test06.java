package test11;

import common.Input;

/**
 * 小テスト第2回 対策
 * 問題6（Test06）: 例外処理を追加する前の雛形（修正課題）
 *
 * TODO: yが0のとき ArithmeticException を投げるよう div メソッドを修正し、
 *       main に try-catch を追加してください。
 */
public class Test06 {
    public static void main(String[] args) {
        int x = Input.getInt();
        int y = Input.getInt();
        int ans = div(x, y);
        System.out.println(x + "÷" + y + "＝" + ans);
    }

    public static int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            // 返す値がない（このままではコンパイルエラーになる）
            return 0; // 仮の戻り値
        }
    }
}
