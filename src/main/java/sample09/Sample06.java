package sample09;

import java.time.LocalDate;

/**
 * 小テスト第1回 対策
 * 問題6: 個数10個のときの総額を表示する
 *
 * 実行結果:
 * 商品名= PC-5613
 * 個　数= 10
 * 総　額= 1120000
 */
public class Sample06 {
    public static void main(String[] args) {
        Item p = new Item("X015", "PC-5613", 112000, LocalDate.of(2020, 10, 31), true);
        IO.println("商品名= " + p.getName());
        IO.println("個　数= " + 10);
        IO.println("総　額= " + p.sougaku(10));
    }
}
