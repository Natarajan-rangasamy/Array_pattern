import java.util.*;
public class Main
{

    public static void print_subarray(int arr[],int length)
    {
       /*Function to print all the subarrays given in an array
        Input arr--> array, length -->length of an array */

        int[] dup = arr;
        int count = 0;
        int k = count;
        while(count < length){
            for (int  i = 0; i < dup.length; i++){

                for ( k = count ; k <= i; k++){
                    System.out.print(dup[k]);
                    if(k == i){
                        System.out.println();
                    }
                }
            }
            count++;
        }








        /* Do not change the code beyond this point*/
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print_subarray(arr,n);

    }
}