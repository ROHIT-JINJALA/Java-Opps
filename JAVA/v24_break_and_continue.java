public class v24_break_and_continue {
    public static void main(String a[]){
        // //break
        // int i;
        // for(i=0; i<50; i++){
        //     System.out.println(i + " java file. ");
        //     if(i==4){
        //         System.out.println("this is break statment on index "+ i);
        //         break;
        //     }
        // }

        // continue
        int i;
        for(i=0; i<20; i++){
            if(i==4){
                System.out.println("this is Continue statment on index "+ i);
                continue;
            }
            System.out.println(i + " java file. ");
        }
    }
    
}