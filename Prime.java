class FindPrime{
	public static void main(String[] args){
		printPrime(1000);
	}
	public static void  printPrime(int n){
		int[] prime = new int[1000];
		int cnt=1;
		prime[0]=2;
		for(int i=3;i<n;i++){
			
			int count=0;
			
			for(int j=0;j<cnt;j++){
				
				if(i%prime[j]==0){
					count++;
				}
				if(prime[j]==i & count == 1){
					prime[cnt++]=i;
					for (int k=0;k<cnt ;k++ ) {
						System.out.print(prime[k]+" ");
					}
					
				}
				if(count > 1){
					break;
				}
			}
			
			
		}
		
	}

}
