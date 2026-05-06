package sample07;

public class Sample04 {
    void main(){
        double[] ary = new double[5];
        ary[0] = 1.0;
        ary[1] = 2.0;
        ary[2] = 3.0;
        ary[3] = 4.0;
        ary[4] = 5.0;
        for(int i = 0; i < ary.length; i++){
            IO.println("ary[" + i + "] = " + ary[i]);
        }
    }
}
