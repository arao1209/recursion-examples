
import java.util.Arrays;

public class FibonacciEx {

    private void fibonacci(){

        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;

        for(int i=2;i<a.length;i++){
            a[i] = a[i-1] + a[i-2];
        }
        System.out.println(Arrays.toString(a));

    }

    private int recrusiveFebonacci(int num){


        if(num == 1 || num == 0){
            return num;
        }
        return recrusiveFebonacci(num-1) + recrusiveFebonacci(num-2);

    }

    public static void main(String[] args) {
        FibonacciEx fibonacciEx = new FibonacciEx();
      //  fibonacciEx.fibonacci();

        for(int i=0;i<10;i++){
            System.out.println(fibonacciEx.recrusiveFebonacci(i));
        }
    }

}
