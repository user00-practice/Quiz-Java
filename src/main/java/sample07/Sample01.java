package sample07;

public class Sample01 {
    void main() {
        int a = Integer.parseInt(IO.readln("整数 a："));
        int b = Integer.parseInt(IO.readln("整数 b："));
        IO.print("大きいのは ");
        IO.print(a > b ? a : b);
        IO.println(" です。");
    }
}
