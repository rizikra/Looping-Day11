public class CekBilPrima {//Array dimulai dari args[0]
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main(String[] args){
		try{		
			int a = Integer.parseInt(args[0]);
			int i ;
			boolean isPrime = true;
			for(i=2;i<a;i++){
				if(a%i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				System.out.println("Bilangan Prima");
			}else{
				System.out.println("Bukan Bilangan Prima");
			}
		}catch(Exception e){
			println ("Angka yang anda masukkan salah, silakan cek kembali");
		}	
        
    }
}