import java.util.Scanner;

public class LargestAndSmallestElementInArray {
    int arr[]=new int[5];
    int temp1=0;
    int temp2=0;
    public void largestelement(){
        temp1=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp1 < arr[i + 1]) {
                temp1 = arr[i+1];
            }
        }
        System.out.println(temp1);
    }

    public void smallestelement(){
        temp2=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp2 > arr[i + 1]) {
                temp2 = arr[i+1];
            }
        }
        System.out.println(temp2);
    }

    public static void main(String[] args) {
        LargestAndSmallestElementInArray obj=new LargestAndSmallestElementInArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]=sc.nextInt();
        }
        System.out.print("Largest element from the array: ");
        obj.largestelement();
        System.out.print("Smallest element from the array: ");
        obj.smallestelement();
    }
}
