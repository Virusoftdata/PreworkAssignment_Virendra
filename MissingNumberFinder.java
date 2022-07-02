import java.util.Scanner;

class MissingNumberFinder{
	
	 public static void main(String[] args){
			 Scanner in = new Scanner(System.in);
			 int size = in .nextInt();
			 int[] arr = new int[size-1];
			 for(int i=0;i<size-1;i++)
			 arr[i] = in.nextInt();
			 System.out.println(missingNumberFinder(arr, size));
	 }
	 static int missingNumberFinder(int array[], int n){
				int i = 1;
				while(n>i){
					if(array[i-1] == i){
						i++;
					}else{
						break;	
					}	
				}
			    
				return i;				
	  }
}