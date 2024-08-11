import java.util.Scanner;
class Selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is without Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Array is with Selection Sorting:");
        Selectionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
     static void Selectionsort(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int tmp=arr[min];
            arr[min]=arr[i];
            arr[i]=tmp;
        }
    }
}