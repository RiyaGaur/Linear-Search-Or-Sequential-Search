import java.util.Scanner;

public class BiggestElementInArray {
    int arr[]=new int[5];
    int temp=0;
    public void biggestelement(){
        temp=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp < arr[i + 1]) {
                temp = arr[i+1];
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        BiggestElementInArray obj=new BiggestElementInArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]=sc.nextInt();
        }
        System.out.print("Biggest element from the array: ");
        obj.biggestelement();
    }
}
