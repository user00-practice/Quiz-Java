package quiz02.sample;

/**
 * 小テスト第2回 対策
 * 問題4: LotNumber を実装した Item クラス
 */
public class Item implements LotNumber {
    private int    model;
    private String name;

    public Item(int model, String name) {
        this.model = model;
        this.name  = name;
    }

    public int    getModel()           { return model; }
    public void   setModel(int model)  { this.model = model; }
    public String getName()            { return name; }
    public void   setName(String name) { this.name = name; }

    @Override
    public String getLotNumber() { return "Item Z010"; }
}
