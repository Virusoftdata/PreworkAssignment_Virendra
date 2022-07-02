import java.util.Scanner;

class PatternPrinter{
		 public static void main(String[] args) {
				 Scanner in = new Scanner(System.in);
				 int n = in .nextInt();
				 patternPrinter(n);
		}
		 static void patternPrinter(int n) {	 
			 	for(int k =0;k<n;k++){	
						 for(int i =0;i<n;i++){
							for(int j=0;j<n-k;j++){			
									System.out.print(n-i);	
							} 
						 }
						 System.out.println();
					}
		
		 }
}