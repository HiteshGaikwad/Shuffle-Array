import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7};

        //calling function to shuffle elements of array
        shuffleFunction(arr);

        //printing shuffled array
        System.out.println("Shuffled Array:-");
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
    public static void shuffleFunction(int[] arr){
        int n=arr.length;
        Random random=new Random();

        for(int i=n-1; i>=0; i--){
            //Generating a random index
            int randomIndex= random.nextInt(i+1);

            //swapping current element with randomIndex element
            int temp= arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
    }
}