# 11 JavaOOP実践 小テスト対策

---

## 問題1

次のクラス図から**抽象クラス `Shape`** を作成してください。  
この抽象クラスは `getName()` と `area()` の **2つの抽象メソッド**を持ちます。

<table>
<tr><th align="center"><em>Shape</em></th></tr>
<tr><td><code>- color : String</code></td></tr>
<tr><td>
# Shape(color : String)<br>
<em>+ getName() : String</em><br>
<em>+ area() : double</em><br>
+ getColor() : String<br>
+ setColor(color : String) : void
</td></tr>
</table>

---

## 問題2

問題1で作成した抽象クラス `Shape` を継承した **`Rectangl` クラス**を  
下のクラス図をもとに作成してください。

- `area()` メソッドは四角形の面積（`width × height`）を返す
- `getName()` メソッドは `"四角形"` という文字列を返す

<table>
<tr><th align="center">Rectangl</th></tr>
<tr><td>
<code>- width : double</code><br>
<code>- height : double</code>
</td></tr>
<tr><td>
+ Rectangl(color : String, width : double, height : double)<br>
+ getWidth() : double<br>
+ setWidth(width : double) : void<br>
+ getHeight() : double<br>
+ setHeight(height : double) : void<br>
+ getName() : String<br>
+ area() : double
</td></tr>
</table>

---

## 問題3

次の抽象メソッドを持つ **`LotNumber` インターフェース**を作成してください。

<table>
<th align="center" style="line-height: 1.1;">
  <span style="font-size: 0.8em;">《interface》</span><br>
  LotNumber
</th>
<tr><td><em>+ getLotNumber() : String</em></td></tr>
</table>

---

## 問題4

下のクラス図で示す **`Item` クラス**に `LotNumber` インターフェースを実装してください。  
`getLotNumber()` メソッドは `"Item Z010"` の文字列を返すようにします。

<table>
<tr><th align="center">Item</th></tr>
<tr><td>
<code>- model : int</code><br>
<code>- name : String</code>
</td></tr>
<tr><td>
+ Item(model : int, name : String)<br>
+ getModel() : int<br>
+ getName() : String<br>
+ setModel(model : int) : void<br>
+ setName(name : String) : void<br>
+ getLotNumber() : String
</td></tr>
</table>

---

## 問題5

次の処理を行うプログラム `Sample05` を作成してください。

1. `color` を `"青"`、`width` を `5.0`、`height` を `3.0` として `Rectangl` クラスのインスタンスを作成し、`Shape` 型の変数 `shp` に代入する
2. `getName()` と `area()` を実行して、図形の名前と面積を表示する
3. `model` を `10112`、`name` を `"AX-GP1"` として `Item` クラスのインスタンスを作成し、`LotNumber` 型の変数 `lot` に代入する
4. `getLotNumber()` を実行して、ロット番号を表示する

**実行結果:**

```
図形の名前：四角形
図形の面積：15.0
ロット番号：Item Z010
```

---

## 問題6

`sample11.Sample06` を修正してください。

次のプログラムは整数 `x`、`y` を入力後 `x ÷ y` の商を計算して表示するプログラムですが、  
`y` が `0` のときに返す値がないため、その部分が仮の戻り値になっています。

**以下の指示に従って修正してください:**

- `div` メソッドで `y` が `0` のとき、`ArithmeticException` 例外を投げる
- `main` に `try-catch` 文を追加する
  - `try` ブロック：`div` メソッドの呼び出しと結果の出力
  - `catch` ブロック：`ArithmeticException` をキャッチし、`"0による割り算はできません"` と表示する

**修正前のコード（`Sample06.java`）:**

```java
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
```

**実行結果（`y = 0` のとき）:**

```
0による割り算はできません
```
