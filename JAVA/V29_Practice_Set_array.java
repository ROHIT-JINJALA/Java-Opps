public class V29_Practice_Set_array {
    public static void main(String[] ar){

        //Practice Qs 1  Sum of array
        // float [] marks ={65.56f, 78.56f, 69.8f, 67.32f};
        // float sum=0;
        // for(float element : marks){
        //     sum = sum + element;
        // }
        // System.out.println(sum);

        //Practice Qs 2 Given number is present in array or not
        // float [] marks ={65.56f, 78.56f, 69.8f, 67.32f};
        // float num = 77.56f;
        // boolean isInArray = false;
        // for(float element:marks){
        //     if (element==num) {
        //         isInArray = true;
        //     }
        // }
        // if (isInArray) {
        //     System.out.println("The valu is present in array.");
        // }
        // else{
        //     System.out.println("The valu is not present in array.");
        // }

        // Practice Qs 3 Average of array using foe each loop
        // float [] phyMarks ={65.56f, 78.56f, 69.8f, 67.32f};
        // float sum = 0;
        // for(float element: phyMarks){
        //     sum = sum + element;
        // }
        // float avg = sum/phyMarks.length;
        // System.out.println(avg);

        // Practice Qs 4 Sum of 2-D array 
        // int mat1[][]= {{1, 2 ,3},
        //                {4, 5, 6}};
        // int mat2[][]= {{6, 5, 4},{3, 2, 1}};
        // int result[][]= {{0, 0, 0},{0, 0, 0}};
        //      //
        // for(int i=0; i<mat1.length;i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // for(int i=0; i<mat1.length;i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //        System.out.print(result[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        // Practice Qs 5 reverce an array
        // int arr[]= {1, 2 ,3, 4, 5, 6 ,7};
        // for(int i= arr.length-1; i>=0; i--){
        //     System.out.println(arr[i]);
        // }

        // Practice Qs 6 find a maximam number
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        int arr[] = {65, 65, 8, 43, 9008};
        int max= Integer.MIN_VALUE;
        for (int element : arr) {
            if (element>max) {
                max = element;
            }
        }
        System.out.println("maximum num is: "+max);

        // Practice Qs 7 find a minimum number
        // int arr[] = {65, -65, 8, 43, 9008};
        // int min= Integer.MAX_VALUE;
        // for (int element : arr) {
        //     if (element<min) {
        //         min = element;
        //     }
        // }
        // System.out.println("maximum num is: "+min);


        // Practice Qs 8
        // int arr[] = {5, 65, 8, 43, 1};
        //int arr[] = {1, 2, 3, 43, 53};
        // boolean isShorted = true;
        // for(int i =0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1]){
        //         isShorted = false;
        //         break;
        //     }
        // }
        // if (isShorted) {
        //     System.out.println("Array is shorted");
        // }
        // else{
        //     System.out.println("Array is not shorted");
        // }
    } 
}
