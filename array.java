import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        //! 1D array

        // int arr[] = {1,2,3,4,5};
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // String array[] = {"A1", "B1", "C1"};
        // for(String c: array){
        //     System.out.println(c);
        // }


        //! 2D array

        // int arr2[][] = {
        //     {1,2,3},
        //     {4,5},
        //     {7,8,9}
        // };

        // int size = arr2.length;

        // for(int i = 0; i<size; i++){
        //     for(int j = 0; j < size; j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //? If element deleted
        // for(int i = 0; i<size; i++){
        //     for(int j = 0; j<arr2[i].length; j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //! Multi-dimensional array
        //? STACK OF MULTIPLE 2D ARRAYS

        // int arr[][][] = {
        //     {
        //         {1,2,3},
        //         {4,5,6},
        //         {7,8,9}
        //     },
        //     {
        //         {10,11,12},
        //         {13,14,15},
        //         {16,17,18}
        //     },
        //     {
        //         {19,20,21},
        //         {22,23},
        //         {25,26,27}
        //     }
        // };

        // for(int i = 0; i<arr.length; i++){
        //     //? FOR ARRAY

        //     for(int j = 0; j<arr.length; j++){
        //         //? FOR ROWS

        //         for(int k = 0; k<arr.length; k++){
        //             //? FOR COLUMNS

        //             System.out.print(arr[i][j][k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }



        //? FOR DELETED ELEMENT
        //         for(int i = 0; i<arr.length; i++){

        //     for(int j = 0; j<arr[i].length; j++){

        //         for(int k = 0; k<arr[i][j].length; k++){

        //             System.out.print(arr[i][j][k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }


        //! DYNAMIC ARRAY

        //? 1D DYNAMIC
        // int arr[] = new int[3];

        // for(int i = 0; i<arr.length; i++){
        //     System.out.println("Enter the "+i+" index: ");
        //     arr[i] = in.nextInt();
        // }

        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }


        //? 2D DYNAMIC
        // int arr[][] = new int[3][3];

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length; j++){
        //         System.out.print("Enter the "+i+" "+j+ " index: ");
        //         arr[i][j] = in.nextInt();
        //     }
        // }

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length; j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }


        //? MULTI DYNAMIC

        // int arr[][][] = new int[3][3][3];

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length; j++){
        //         for(int k = 0; k < arr.length; k++){
        //             System.out.println("Enter the "+i+" "+j+" "+k+" index: ");
        //             arr[i][j][k] = in.nextInt();
        //         }
        //     }
        // }

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length; j++){
        //         for(int k = 0; k < arr.length; k++){
        //             System.out.print(arr[i][j][k] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }



        System.out.println(Math.max(10,5));
        System.out.println(Math.min(10,5));
        System.out.println(Math.round(2.3));
        System.out.println(Math.floor(2.3));
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.sin(0));
        System.out.println(Math.cos(0));
        System.out.println(Math.log(0));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt((9)));

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static int sub(int a , int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a , int b){
        return a/b;
    }



    

}

