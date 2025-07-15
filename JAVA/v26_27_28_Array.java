public class v26_27_28_Array {
    public static void main(String [] arr){

        int marks[] = {98, 97, 67, 89, 78, 87};
        for(int i= 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //for each methode
        System.out.println("print arr using for each");
        for (int element : marks) {
            System.out.println(element);
        }

        //2-D Array

        int flates[][];
        flates = new int [2][3];

        flates[0][0] = 101;
        flates[0][1] = 101;
        flates[0][2] = 101;
        flates[1][0] = 201;
        flates[1][1] = 201;
        flates[1][2] = 201;

        for(int i=0;i<flates.length;i++){
            for(int j=0; j<flates[i].length;j++){
                System.out.print(flates[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
} 