package sample07;

public class Sample03 {
    void main(){
        IO.println("整数値ｘとｙの平均値を求めます。");
        int x = Integer.parseInt(IO.readln("xの値："));
        int y = Integer.parseInt(IO.readln("yの値："));
        IO.print("ｘとｙの平均値は ");
        IO.print((x + y) / (double)2);
        IO.println(" です。");
    }
}
