package sample06;

public class Sample04 {
    void main() {
        IO.println("x と y の和と差を求めます。");

        int x = Integer.parseInt(IO.readln("x の値："));
        int y = Integer.parseInt(IO.readln("y の値："));

        IO.println("x + y = " + (x + y));
        IO.println("x - y = " + (x - y));
    }
}
