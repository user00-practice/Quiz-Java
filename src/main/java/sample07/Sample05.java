package sample07;

public class Sample05 {
    int min(int a, int b, int c){
        int result = a;
        if(result > b){
            result = b;
        }
        if(result > c){
            result = c;
        }
        return result;
    }

    void main(){
        int a = Integer.parseInt(IO.readln("整数 a："));
        int b = Integer.parseInt(IO.readln("整数 b："));
        int c = Integer.parseInt(IO.readln("整数 c："));
        IO.println("最小値は " + min(a,b,c) + " です。");
    }
}
