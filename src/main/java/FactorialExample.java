
public class FactorialExample {

    private int factorial(int a){

        if(a==0){
            return 1;
        }
        else {
            return a * factorial(--a);
        }

    }

    public static void main(String[] args) {

        FactorialExample factorialExample = new FactorialExample();
        System.out.println(factorialExample.factorial(5));

    }
}
