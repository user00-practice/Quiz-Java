package quiz01.sample;

import java.time.LocalDate;

/**
 * 小テスト第1回 対策
 * 問題5: Item インスタンスの文字列表現を表示する
 *
 * 実行結果:
 * Item [number=X015, name=PC-5613, price=112000, date=2020-10-31, stock=true]
 */
public class Sample05 {
    public static void main(String[] args) {
        Item p = new Item("X015", "PC-5613", 112000, LocalDate.of(2020, 10, 31), true);
        System.out.println(p);
    }
}
