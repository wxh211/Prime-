class FindPrime{
	public static void main(String[] args){
		printPrime(1000);
	}
	public static void  printPrime(int n){
		
		for(int i=2;i<n;i++){
			
			int count=0;
			
			for(int j=2;j<=i;j++){
				
				if(i%j==0){
					count++;
				}
				if(j==i & count == 1){
					System.out.print(i+" ");
				}
				if(count > 1){
					break;
				}
			}
			
			
		}
		
	}

}