import java.util.Scanner;
public class Quicksort {

    public static void arrayElements(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int size = scanner.nextInt();

        int array[] = new int[size];

        if(array.length ==0){
            System.out.println("Array is empty");
            return;
        }
        else{
        System.out.println("Enter " + size + " elements");

        for(int p = 0; p<size;p++){
            System.out.println("Element" + (p+1) + " :"); 
            array[p]=scanner.nextInt();
        } 
    }

       
        System.out.println("The array you have entered is: ");    

        for(int p=0;p<size;p++){
            System.out.println(array[p] +" ");
        }

        scanner.close();

        QuickSort(array, 0, array.length-1);

        System.out.println("The sorted array is: ");
        for (int p = 0; p < size; p++) {
            System.out.print(array[p] + " ");
        }
        System.out.println();  
    


    }

    public static void QuickSort(int array[],int low,int high){
        if(low<high){
            int pi = partition(array,low,high);

            QuickSort(array,low,pi-1);
            QuickSort(array,pi+1,high);
        }
    }


    public static int partition(int []array,int low,int high){
        int pi = array[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(array[j]<=pi){
                i++;
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
            int temp = array[i+1];
            array[i+1]=array[high];
            array[high]=temp;

            return i+1;

    }

    public static void main(String[] args) {
        arrayElements();
    }
}