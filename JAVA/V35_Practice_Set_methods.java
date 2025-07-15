public class V35_Practice_Set_methods {

    public static void multiplicatintable(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    public static void pattern1(int n){
        for(int i=0 ; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static int sumRec(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }  
    }

    public static void pattern2(int n){
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static int fibb(int n){
        /*if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibb(n-1) + fibb(n-2);
        }
    }

    public static float avg(int ...abab){
        float sum = 0;
        for(int a : abab){
            sum += a;
        }
        return sum/abab.length;
    }

    public static float cToF(float f) {
        return (f*9/5)+32;
    }
    public static void main(String ar[]){

        // Practice Qs 1
        // multiplicatintable(7);

        // Practice Qs 2
        // pattern1(9);

        // Practice Qs 3
        // int c =sumRec(7);
        // System.out.println(c);

        // Practice Qs 4
        //pattern2(5);

        // Practice Qs 5
        // int result = fibb(5);
        // System.out.println(result);  

        // Practice Qs 6
        // int avgOfGivenNum = avg(1, 2, 3 , 4, 5);
        // System.out.println(avg(1, 2, 3 , 4, 5));

        // Practice Qs 6
        // double C=32;
        // double a= 42.36f;
        float ans = cToF(42.36f);
        System.out.println(ans);
    }
}