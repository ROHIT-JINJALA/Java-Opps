public class v17_logicalOperator {
    public static void main(String arr[]){

        boolean a = true;
        boolean b = false;

        // AND operator
        // System.out.println("For logial AND...");
        // if(a && b){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }

        // OR operator
        System.out.println("For logial OR...");
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // NOT operator
        System.out.println("For logial NOT...");

        System.out.println("Not (a) is " + !a);
        System.out.println("Not (b) is " + !b);

    }
}
