
public class RecursionEx {

    // this method will create stackOverFlowException
    private void recusrionMethod(){
        recusrionMethod();
    }


    public static void main(String[] args) {

        RecursionEx recursionEx = new RecursionEx();
        recursionEx.recusrionMethod();

    }
}

