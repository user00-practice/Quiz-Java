package sample07;

public class Sample02 {
    void main(){
        int n = Integer.parseInt(IO.readln("何個+を表示しますか："));
        for (int i = 0; i < n; i++) {
            IO.print("+");
        }
    }
}
