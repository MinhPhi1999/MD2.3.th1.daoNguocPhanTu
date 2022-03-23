//package com.codegym;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//	int size;
//    int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("enter size");
//            size = scanner.nextInt();
//            if (size>20){
//                System.out.println("Size không quá 20");
//            }
//        }while (size>20);
//    array = new int[size];
//    int i = 0;
//    while (i<array.length) {
//        System.out.println("enter element"+ (i+1));
//        array[i]= scanner.nextInt();
//        i++;
//    }
//        System.out.println("Elements in array: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
//
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }
//        System.out.println("Reverse array: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
//    }
//}

package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {1,2,4,68,3,2,7};
        daoNguocPhanTuMang(array);
    }
    static void    daoNguocPhanTuMang(int[] arr){
        for (int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        for (int newArray: arr ) {
            System.out.print(newArray +" ");
        }
    }
}
