# JavaOOP 小テスト対策プロジェクト

IntelliJ IDEA 用・Java SE 25 対応

---

## クローン手順

```bash
git clone <リポジトリURL>
```

IntelliJ IDEA でクローンしたフォルダを開き、  
**File → Project Structure → SDK** で JDK 25 を選択してください。

---

## パッケージ構成

```
src/main/java/
├── common/          共通ユーティリティ（Input クラスなど）
│
├── quiz01/          第1回 小テスト対策（JavaOOP基礎）
│   └── sample/      対策サンプルコード（Item, Sample05, Sample06）
│
├── quiz02/          第2回 小テスト対策（JavaOOP実践）
│   ├── sample/      対策サンプルコード（Shape, Rectangl, LotNumber, Item, Sample05, Sample06）
│   └── test/        修正課題（Test06）
│
├── quiz03/          第3回 小テスト対策（未追加）
│   └── sample/
├── quiz04/          第4回 小テスト対策（未追加）
│   └── sample/
├── quiz05/          第5回 小テスト対策（未追加）
│   └── sample/
├── quiz06/          第6回 小テスト対策（未追加）
│   └── sample/
│
├── answer01/        第1回 本番解答用（テスト当日ここに作成）
├── answer02/        第2回 本番解答用
├── answer03/        第3回 本番解答用
├── answer04/        第4回 本番解答用
├── answer05/        第5回 本番解答用
└── answer06/        第6回 本番解答用
```

---

## 各回の内容

### 第1回（quiz01）— JavaOOP基礎

| ファイル | 内容 |
|---|---|
| `Item.java` | 問題1〜4：フィールド・コンストラクタ・ゲッター・セッター・sougaku・toString |
| `Sample05.java` | 問題5：インスタンス生成・toString の実行確認 |
| `Sample06.java` | 問題6：sougaku メソッドで総額を計算・表示 |

### 第2回（quiz02）— JavaOOP実践

| ファイル | 内容 |
|---|---|
| `Shape.java` | 問題1：抽象クラス |
| `Rectangl.java` | 問題2：Shape を継承した具体クラス |
| `LotNumber.java` | 問題3：インターフェース |
| `Item.java` | 問題4：LotNumber を実装したクラス |
| `Sample05.java` | 問題5：ポリモーフィズムの動作確認 |
| `Sample06.java` | 問題6：例外処理の完成版 |
| `test/Test06.java` | 問題6：修正前の雛形（課題用） |

---

## 本番解答について

`answer01` 〜 `answer06` パッケージに解答コードを作成してください。  
ファイル名・クラス名は問題の指示に従って変更してください。
