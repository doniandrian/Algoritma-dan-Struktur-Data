

import java.util.Scanner;
public class mod{
    public static void mergeSort (int[] inputArray,int left,int right){
       
        if(left<right){
            int q = ((left +right)/2);
            mergeSort(inputArray,left,q );
            mergeSort(inputArray, q+1,right );
            merge(inputArray,left,q,right);
            
        }
       
        
        


    }
    private static void merge(int [] arrayInput,int left,int middle,int right)
{
int lSize = middle-left+1;
int rSize = right-middle;
int [] tempArrayL = new int [lSize+1];
int [] tempArrayR = new int [rSize+1];
for(int i = 0;i<lSize;i++){
    tempArrayL[i] = arrayInput[left+i];

}
for(int i = 0;i<rSize;i++){
    tempArrayR[i] = arrayInput[middle+1+i];
}
tempArrayL[lSize] = Integer.MAX_VALUE;
tempArrayR[rSize] = Integer.MAX_VALUE;
int arrayLIdx = 0;
int arrayRIdx = 0;

for(int i = left;i<=right;i++){
    if(tempArrayL[arrayLIdx]%5<=tempArrayR[arrayRIdx]%5){
        arrayInput[i] = tempArrayL[arrayLIdx];
        arrayLIdx+=1;
       
    }
    else{
        arrayInput[i] = tempArrayR[arrayRIdx];
        arrayRIdx+=1;
        
       
    }
}
}
public static void sort(int [] arrayInput){
   mergeSort(arrayInput,0,arrayInput.length-1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input;
        int jumlahElemen = sc.nextInt();
        input = new int [jumlahElemen];
        //int mod = sc.nextInt();
        for(int i = 0;i<jumlahElemen;i++){
            input[i] = sc.nextInt();
        }
        sort(input);
        
        
        
        for(int i = 0;i<jumlahElemen;i++){
            System.out.print(input[i] + " ");
        }
        
    }
}