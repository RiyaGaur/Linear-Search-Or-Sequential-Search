import java.util.Scanner;

public class SearchElementFromArray {
    int arr[]=new int[5];
    boolean found=false;
    public void searchingelement(int searchelement){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==searchelement){
                System.out.println("Element found at position "+ (i+1));
                found=true;
                break;
            }
        }
        if (found==false){
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        SearchElementFromArray obj=new SearchElementFromArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values in the array:");
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i]=sc.nextInt();
        }
        System.out.print("Enter element which you want to search in the array: ");
        int se=sc.nextInt();
        obj.searchingelement(se);
    }
}
