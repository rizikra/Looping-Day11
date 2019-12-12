public class KlasifikasiBilPrima {
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main(String[] args){		
		int[] data = {3, 10, 7, 11, 15, 16, 23, 50};
		
		for(int index = 0; index < data.length; index++){
			//start program cek prima atau bukan
			//starr cek prima

			boolean isPrime = true;
			for(int i = 2; i < data[index]; i++){
				if(data[index] % i == 0){
					isPrime = false;
					break;
				}
			}
		if(isPrime == true){
			println (data[index]); 
			}
			//end cek prima
			//end program cek prima atau bukan
		}
	}
}	